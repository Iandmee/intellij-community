package com.intellij.searchEverywhereMl.semantics

import com.intellij.openapi.components.serviceAsync
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import com.intellij.platform.ml.embeddings.search.services.*
import com.intellij.searchEverywhereMl.semantics.settings.SearchEverywhereSemanticSettings

private class SemanticSearchInitializer : ProjectActivity {
  /**
   * Instantiate services for the first time with state loading if available.
   * Whether the state exists or not, we generate the missing embeddings.
   */
  override suspend fun execute(project: Project) {
    val searchEverywhereSemanticSettings = serviceAsync<SearchEverywhereSemanticSettings>()

    EmbeddingIndexSettingsImpl.getInstance(project).registerClientSettings(
      object : EmbeddingIndexSettings {
        override val shouldIndexFiles: Boolean
          get() = searchEverywhereSemanticSettings.enabledInFilesTab
        override val shouldIndexClasses: Boolean
          get() = searchEverywhereSemanticSettings.enabledInClassesTab
        override val shouldIndexSymbols: Boolean
          get() = searchEverywhereSemanticSettings.enabledInSymbolsTab
      }
    )
  }
}