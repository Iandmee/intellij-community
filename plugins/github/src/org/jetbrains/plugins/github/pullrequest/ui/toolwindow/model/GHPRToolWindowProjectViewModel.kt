// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.plugins.github.pullrequest.ui.toolwindow.model

import com.github.benmanes.caffeine.cache.Caffeine
import com.intellij.collaboration.async.withInitial
import com.intellij.collaboration.ui.toolwindow.ReviewToolwindowProjectViewModel
import com.intellij.collaboration.ui.toolwindow.ReviewToolwindowTabs
import com.intellij.collaboration.ui.toolwindow.ReviewToolwindowTabsStateHolder
import com.intellij.collaboration.util.ComputedResult
import com.intellij.collaboration.util.computeEmitting
import com.intellij.collaboration.util.onFailure
import com.intellij.openapi.Disposable
import com.intellij.openapi.components.service
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.project.Project
import com.intellij.platform.util.coroutines.childScope
import git4idea.GitStandardRemoteBranch
import git4idea.push.GitPushRepoResult
import git4idea.remote.hosting.currentRemoteBranchFlow
import git4idea.remote.hosting.knownRepositories
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.*
import org.jetbrains.annotations.ApiStatus
import org.jetbrains.plugins.github.api.GHRepositoryConnection
import org.jetbrains.plugins.github.api.GHRepositoryCoordinates
import org.jetbrains.plugins.github.api.data.pullrequest.GHPullRequestShort
import org.jetbrains.plugins.github.pullrequest.GHPRListViewModel
import org.jetbrains.plugins.github.pullrequest.data.GHPRDataContext
import org.jetbrains.plugins.github.pullrequest.data.GHPRIdentifier
import org.jetbrains.plugins.github.pullrequest.ui.GHPRViewModelContainer
import org.jetbrains.plugins.github.pullrequest.ui.diff.GHPRDiffViewModel
import org.jetbrains.plugins.github.pullrequest.ui.editor.GHPRReviewInEditorViewModel
import org.jetbrains.plugins.github.pullrequest.ui.review.GHPRBranchWidgetViewModel
import org.jetbrains.plugins.github.pullrequest.ui.timeline.GHPRTimelineViewModel
import org.jetbrains.plugins.github.pullrequest.ui.toolwindow.GHPRToolWindowTab
import org.jetbrains.plugins.github.ui.util.GHUIUtil
import org.jetbrains.plugins.github.util.DisposalCountingHolder
import org.jetbrains.plugins.github.util.GHGitRepositoryMapping
import org.jetbrains.plugins.github.util.GHHostedRepositoriesManager

private val LOG = logger<GHPRToolWindowProjectViewModel>()

@ApiStatus.Experimental
class GHPRToolWindowProjectViewModel internal constructor(
  private val project: Project,
  parentCs: CoroutineScope,
  private val twVm: GHPRToolWindowViewModel,
  connection: GHRepositoryConnection
) : ReviewToolwindowProjectViewModel<GHPRToolWindowTab, GHPRToolWindowTabViewModel> {
  private val cs = parentCs.childScope()

  internal val dataContext: GHPRDataContext = connection.dataContext
  val defaultBranch: String? = dataContext.repositoryDataService.defaultBranchName

  private val allRepos = project.service<GHHostedRepositoriesManager>().knownRepositories.map(GHGitRepositoryMapping::repository)
  val repository: GHRepositoryCoordinates = dataContext.repositoryDataService.repositoryCoordinates
  override val projectName: String = GHUIUtil.getRepositoryDisplayName(allRepos, repository)

  override val listVm: GHPRListViewModel = GHPRListViewModel(project, cs, connection.dataContext)

  private val pullRequestsVms = Caffeine.newBuilder().build<GHPRIdentifier, DisposalCountingHolder<GHPRViewModelContainer>> { id ->
    DisposalCountingHolder {
      GHPRViewModelContainer(project, cs, dataContext, this, id, it)
    }
  }

  private val tabsHelper = ReviewToolwindowTabsStateHolder<GHPRToolWindowTab, GHPRToolWindowTabViewModel>()
  override val tabs: StateFlow<ReviewToolwindowTabs<GHPRToolWindowTab, GHPRToolWindowTabViewModel>> = tabsHelper.tabs.asStateFlow()

  private fun createVm(tab: GHPRToolWindowTab.PullRequest): GHPRToolWindowTabViewModel.PullRequest =
    GHPRToolWindowTabViewModel.PullRequest(cs, this, tab.prId)

  private fun createVm(tab: GHPRToolWindowTab.NewPullRequest): GHPRToolWindowTabViewModel.NewPullRequest =
    GHPRToolWindowTabViewModel.NewPullRequest(project, dataContext)

  override fun selectTab(tab: GHPRToolWindowTab?) = tabsHelper.select(tab)
  override fun closeTab(tab: GHPRToolWindowTab) = tabsHelper.close(tab)

  fun createPullRequest(requestFocus: Boolean = true) {
    tabsHelper.showTab(GHPRToolWindowTab.NewPullRequest, ::createVm) {
      if (requestFocus) {
        requestFocus()
      }
    }
  }

  fun viewList(requestFocus: Boolean = true) {
    selectTab(null)
    if (requestFocus) {
      listVm.requestFocus()
    }
  }

  fun viewPullRequest(id: GHPRIdentifier, requestFocus: Boolean = true) {
    if (requestFocus) {
      twVm.activate()
    }
    tabsHelper.showTab(GHPRToolWindowTab.PullRequest(id), ::createVm) {
      if (requestFocus) {
        requestFocus()
      }
    }
  }

  fun viewPullRequest(id: GHPRIdentifier, commitOid: String) {
    twVm.activate()
    tabsHelper.showTab(GHPRToolWindowTab.PullRequest(id), ::createVm) {
      selectCommit(commitOid)
    }
  }

  fun openPullRequestTimeline(id: GHPRIdentifier, requestFocus: Boolean) =
    dataContext.filesManager.createAndOpenTimelineFile(id, requestFocus)

  fun openPullRequestDiff(id: GHPRIdentifier, requestFocus: Boolean) =
    dataContext.filesManager.createAndOpenDiffFile(id, requestFocus)

  fun acquireInfoViewModel(id: GHPRIdentifier, disposable: Disposable): GHPRInfoViewModel =
    pullRequestsVms[id].acquireValue(disposable).infoVm

  fun acquireEditorReviewViewModel(id: GHPRIdentifier, disposable: Disposable): GHPRReviewInEditorViewModel =
    pullRequestsVms[id].acquireValue(disposable).editorVm

  fun acquireBranchWidgetModel(id: GHPRIdentifier, disposable: Disposable): GHPRBranchWidgetViewModel =
    pullRequestsVms[id].acquireValue(disposable).branchWidgetVm

  fun acquireDiffViewModel(id: GHPRIdentifier, disposable: Disposable): GHPRDiffViewModel =
    pullRequestsVms[id].acquireValue(disposable).diffVm

  fun acquireTimelineViewModel(id: GHPRIdentifier, disposable: Disposable): GHPRTimelineViewModel =
    pullRequestsVms[id].acquireValue(disposable).timelineVm

  fun findDetails(pullRequest: GHPRIdentifier): GHPullRequestShort? =
    dataContext.listLoader.loadedData.find { it.id == pullRequest.id }
    ?: dataContext.dataProviderRepository.findDataProvider(pullRequest)?.detailsData?.loadedDetails

  private val prOnCurrentBranchRefreshSignal =
    MutableSharedFlow<Unit>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)

  val prOnCurrentBranch: StateFlow<ComputedResult<GHPRIdentifier?>?> =
    connection.repo.remote.currentRemoteBranchFlow()
      .combineTransform(prOnCurrentBranchRefreshSignal.withInitial(Unit)) { remoteBranch, _ ->
        if (remoteBranch == null) {
          emit(ComputedResult.success(null))
        }
        else {
          computeEmitting {
            val targetRepository = connection.repo.repository.repositoryPath
            dataContext.creationService.findOpenPullRequest(null, targetRepository, remoteBranch)
          }?.onFailure {
            LOG.warn("Could not lookup a pull request for current branch", it)
          }
        }
      }.stateIn(cs, SharingStarted.Lazily, null)

  suspend fun isExistingPullRequest(pushResult: GitPushRepoResult): Boolean? {
    val creationService = dataContext.creationService
    val repositoryDataService = dataContext.repositoryDataService

    val repositoryMapping = repositoryDataService.repositoryMapping
    val defaultRemoteBranch = repositoryDataService.getDefaultRemoteBranch() ?: return null

    val pullRequest = creationService.findOpenPullRequest(
      baseBranch = defaultRemoteBranch,
      repositoryMapping.repository.repositoryPath,
      headBranch = GitStandardRemoteBranch(repositoryMapping.gitRemote, pushResult.sourceBranch)
    )

    return pullRequest != null
  }

  fun refreshPrOnCurrentBranch() {
    prOnCurrentBranchRefreshSignal.tryEmit(Unit)
  }
}