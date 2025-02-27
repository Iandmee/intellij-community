// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.configurationStore

import com.intellij.openapi.application.EDT
import com.intellij.openapi.components.RoamingType
import com.intellij.openapi.components.ServiceDescriptor
import com.intellij.openapi.diagnostic.getOrLogException
import com.intellij.openapi.extensions.PluginId
import com.intellij.openapi.progress.ProcessCanceledException
import com.intellij.openapi.progress.blockingContext
import com.intellij.serviceContainer.ComponentManagerImpl
import com.intellij.util.concurrency.SynchronizedClearableLazy
import kotlinx.coroutines.*

abstract class ComponentStoreWithExtraComponents : ComponentStoreImpl() {
  protected abstract val serviceContainer: ComponentManagerImpl

  private val asyncSettingsSavingComponents = SynchronizedClearableLazy {
    val result = mutableListOf<SettingsSavingComponent>()
    for (instance in serviceContainer.instances()) {
      if (instance is SettingsSavingComponent) {
        result.add(instance)
      }
      else if (instance is @Suppress("DEPRECATION") com.intellij.openapi.components.SettingsSavingComponent) {
        result.add(object : SettingsSavingComponent {
          override suspend fun save() {
            withContext(Dispatchers.EDT) {
              blockingContext {
                instance.save()
              }
            }
          }
        })
      }
    }
    result
  }

  final override fun initComponent(component: Any, serviceDescriptor: ServiceDescriptor?, pluginId: PluginId?) {
    if (component is SettingsSavingComponent) {
      asyncSettingsSavingComponents.drop()
    }
    super.initComponent(component = component, serviceDescriptor = serviceDescriptor, pluginId = pluginId)
  }

  override fun unloadComponent(component: Any) {
    if (component is SettingsSavingComponent) {
      asyncSettingsSavingComponents.drop()
    }
    super.unloadComponent(component)
  }

  override suspend fun doSave(saveResult: SaveResult, forceSavingAllSettings: Boolean) {
    val saveSessionManager = createSaveSessionProducerManager()
    saveSettingsAndCommitComponents(saveResult, forceSavingAllSettings, saveSessionManager)
    saveSessionManager.save(saveResult)
  }

  internal suspend fun saveSettingsAndCommitComponents(
    saveResult: SaveResult,
    forceSavingAllSettings: Boolean,
    sessionManager: SaveSessionProducerManager
  ) {
    coroutineScope {
      for (settingsSavingComponent in asyncSettingsSavingComponents.value) {
        launch {
          try {
            settingsSavingComponent.save()
          }
          catch (e: ProcessCanceledException) { throw e }
          catch (e: CancellationException) { throw e }
          catch (e: Throwable) {
            saveResult.addError(e)
          }
        }
      }
    }

    // SchemeManager (asyncSettingsSavingComponent) must be saved before saving components
    // (component state uses scheme manager in an ipr project, so, we must save it before) so, call it sequentially
    commitComponents(forceSavingAllSettings, sessionManager, saveResult)
  }

  override suspend fun commitComponents(isForce: Boolean, sessionManager: SaveSessionProducerManager, saveResult: SaveResult) {
    // ensure that this task will not interrupt regular saving
    runCatching {
      commitObsoleteComponents(session = sessionManager, isProjectLevel = false)
    }.getOrLogException(LOG)
    super.commitComponents(isForce, sessionManager, saveResult)
  }

  internal open fun commitObsoleteComponents(session: SaveSessionProducerManager, isProjectLevel: Boolean) {
    for (bean in ObsoleteStorageBean.EP_NAME.lazySequence()) {
      if (bean.isProjectLevel != isProjectLevel) {
        continue
      }

      val storage = (storageManager as? StateStorageManagerImpl)?.getOrCreateStorage(bean.file ?: continue, RoamingType.DISABLED)
      if (storage != null) {
        for (componentName in bean.components) {
          session.getProducer(storage)?.setState(null, componentName, null)
        }
      }
    }
  }
}
