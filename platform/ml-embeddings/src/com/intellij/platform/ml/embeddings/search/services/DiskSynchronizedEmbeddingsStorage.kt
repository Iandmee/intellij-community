// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.platform.ml.embeddings.search.services

import com.intellij.openapi.project.Project
import com.intellij.platform.ml.embeddings.search.indices.DiskSynchronizedEmbeddingSearchIndex
import com.intellij.platform.ml.embeddings.search.indices.IndexableEntity
import com.intellij.platform.ml.embeddings.search.utils.ScoredText
import com.intellij.platform.ml.embeddings.utils.generateEmbedding
import com.intellij.util.concurrency.annotations.RequiresBackgroundThread
import kotlinx.coroutines.*

abstract class DiskSynchronizedEmbeddingsStorage<T : IndexableEntity>(val project: Project,
                                                                      private val cs: CoroutineScope) : EmbeddingsStorage {
  abstract val index: DiskSynchronizedEmbeddingSearchIndex

  @RequiresBackgroundThread
  override suspend fun searchNeighbours(text: String, topK: Int, similarityThreshold: Double?): List<ScoredText> {
    if (index.size == 0) return emptyList()
    FileBasedEmbeddingStoragesManager.getInstance(project).triggerIndexing()
    val embedding = generateEmbedding(text) ?: return emptyList()
    return index.findClosest(embedding, topK, similarityThreshold)
  }

  @RequiresBackgroundThread
  suspend fun streamSearchNeighbours(text: String, similarityThreshold: Double? = null): Sequence<ScoredText> {
    if (index.size == 0) return emptySequence()
    FileBasedEmbeddingStoragesManager.getInstance(project).triggerIndexing()
    val embedding = generateEmbedding(text) ?: return emptySequence()
    return index.streamFindClose(embedding, similarityThreshold)
  }
}
