// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.platform.lvcs.impl

import com.intellij.history.ActivityPresentationProvider
import com.intellij.history.core.LocalHistoryFacade
import com.intellij.history.core.changes.ChangeSet
import com.intellij.history.core.collectChanges
import com.intellij.history.core.matches
import com.intellij.history.core.processContents
import com.intellij.history.integration.IdeaGateway
import com.intellij.history.integration.LocalHistoryImpl
import com.intellij.openapi.extensions.ExtensionPointName
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Disposer
import com.intellij.platform.lvcs.impl.diff.createDiffData
import com.intellij.ui.JBColor
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import java.awt.Color

internal const val USE_OLD_CONTENT = true

internal class LocalHistoryActivityProvider(val project: Project, private val gateway: IdeaGateway) : ActivityProvider {
  private val facade = LocalHistoryImpl.getInstanceImpl().facade!!

  override fun getActivityItemsChanged(scope: ActivityScope): Flow<Unit> {
    return facade.onChangeSetFinished(project, gateway, scope)
  }

  override fun loadActivityList(scope: ActivityScope, scopeFilter: String?): List<ActivityItem> {
    val result = mutableListOf<ActivityItem>()
    val projectId = project.locationHash
    if (scope is ActivityScope.File) {
      val path = gateway.getPathOrUrl(scope.file)
      gateway.registerUnsavedDocuments(facade)
      facade.collectChanges(projectId, path, scopeFilter) { changeSet ->
        if (changeSet.isSystemLabelOnly) return@collectChanges
        result.add(changeSet.toActivityItem(scope))
      }
    }
    else {
      for (changeSet in facade.changes) {
        if (changeSet.isSystemLabelOnly) continue
        if (changeSet.isLabelOnly && !changeSet.changes.any { it.affectsProject(projectId) }) continue
        result.add(changeSet.toActivityItem(scope))
      }
    }
    return result
  }

  override fun filterActivityList(scope: ActivityScope, data: ActivityData, activityFilter: String?): Set<ActivityItem>? {
    val changeSets = data.items.filterIsInstance<ChangeSetActivityItem>().mapTo(mutableSetOf()) { it.id }
    if (activityFilter.isNullOrEmpty() || changeSets.isEmpty()) return null
    val fileScope = scope as? ActivityScope.File ?: return null

    val filteredIds = mutableSetOf<Long>()
    val processor: (Long, String?) -> Boolean = { changeSetId, content ->
      if (content?.contains(activityFilter, true) == true) filteredIds.add(changeSetId)
      true
    }

    if (fileScope is ActivityScope.Selection) {
      data.getSelectionCalculator(facade, gateway, fileScope, USE_OLD_CONTENT).processContents(processor)
    }
    else {
      val rootEntry = data.getRootEntry(gateway).copy()
      val path = gateway.getPathOrUrl(fileScope.file)
      facade.processContents(gateway, rootEntry, path, changeSets, before = USE_OLD_CONTENT, processor = processor)
    }

    return data.items.filterTo(mutableSetOf()) { (it is ChangeSetActivityItem) && filteredIds.contains(it.id) }
  }

  override fun loadDiffData(scope: ActivityScope, selection: ActivitySelection): ActivityDiffData? {
    val changeSetSelection = selection.toChangeSetSelection() ?: return null
    return facade.createDiffData(gateway, scope, changeSetSelection, USE_OLD_CONTENT)
  }

  override fun isScopeFilterSupported(scope: ActivityScope): Boolean {
    return scope is ActivityScope.Directory
  }

  override fun isActivityFilterSupported(scope: ActivityScope): Boolean {
    return scope is ActivityScope.SingleFile || scope is ActivityScope.Selection
  }

  override fun getPresentation(item: ActivityItem): ActivityPresentation? {
    if (item !is ChangeSetActivityItem) return null

    val activityId = item.activityId
    val provider = activityId?.let { ACTIVITY_PRESENTATION_PROVIDER_EP.findFirstSafe { it.id == activityId.providerId } }
    val icon = provider?.getIcon(activityId.kind)
    return when (item) {
      is ChangeActivityItem -> ActivityPresentation(item.name ?: "", icon, showBackground = true, highlightColor = null)
      is LabelActivityItem -> {
        val color = provider?.getColor(activityId.kind) ?: intToColor(item.color)
        ActivityPresentation(item.name ?: "", icon, showBackground = false, highlightColor = color)
      }
      else -> null
    }
  }
}

private fun LocalHistoryFacade.onChangeSetFinished(project: Project, gateway: IdeaGateway, scope: ActivityScope): Flow<Unit> {
  val condition: (ChangeSet) -> Boolean
  if (scope is ActivityScope.File) {
    val path = gateway.getPathOrUrl(scope.file)
    condition = { changeSet -> changeSet.anyChangeMatches { change -> change.matches(project.locationHash, path, null) } }
  }
  else {
    condition = { true }
  }

  return callbackFlow {
    val listenerDisposable = Disposer.newDisposable()
    this@onChangeSetFinished.addListener(object : LocalHistoryFacade.Listener() {
      override fun changeSetFinished(changeSet: ChangeSet) {
        if (condition(changeSet)) {
          trySend(Unit)
        }
      }
    }, listenerDisposable)
    trySend(Unit)
    awaitClose { Disposer.dispose(listenerDisposable) }
  }
}

val ACTIVITY_PRESENTATION_PROVIDER_EP = ExtensionPointName.create<ActivityPresentationProvider>(
  "com.intellij.history.activityPresentationProvider")

private val USER_LABEL_COLOR = JBColor(Color(230, 230, 250), Color(89, 96, 74))
private fun intToColor(color: Int) = color.takeIf { it != -1 }?.let { Color(it) } ?: USER_LABEL_COLOR
