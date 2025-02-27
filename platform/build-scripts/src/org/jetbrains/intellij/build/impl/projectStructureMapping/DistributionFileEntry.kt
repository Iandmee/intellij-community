// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.intellij.build.impl.projectStructureMapping

import org.jetbrains.intellij.build.impl.ProjectLibraryData
import java.nio.file.Path

sealed interface DistributionFileEntry {
  /**
   * Path to a file in IDE distribution
   */
  val path: Path

  val relativeOutputFile: String?

  /**
   * Type of the element in the project configuration which was copied to [.path]
   */
  val type: String

  val hash: Long

  fun changePath(newFile: Path): DistributionFileEntry
}

sealed interface LibraryFileEntry : DistributionFileEntry {
  val libraryFile: Path?
  val size: Int
}

/**
 * Represents a file in module-level library
 */
internal data class ModuleLibraryFileEntry(override val path: Path,
                                           @JvmField val moduleName: String,
                                           @JvmField val libraryName: String,
                                           override val libraryFile: Path?,
                                           override val size: Int,
                                           override val hash: Long) : DistributionFileEntry, LibraryFileEntry {
  override val relativeOutputFile: String?
    get() = null

  override val type: String
    get() = "module-library-file"

  override fun changePath(newFile: Path): ModuleLibraryFileEntry {
    return ModuleLibraryFileEntry(path = newFile,
                                  moduleName = moduleName,
                                  libraryName = libraryName,
                                  libraryFile = libraryFile,
                                  hash = hash,
                                  size = size)
  }
}

/**
 * Represents test classes of a module
 */
internal data class ModuleTestOutputEntry(override val path: Path, @JvmField val moduleName: String) : DistributionFileEntry {
  override val relativeOutputFile: String?
    get() = null

  override val type: String
    get() = "module-test-output"

  override val hash: Long
    get() = 0

  override fun changePath(newFile: Path) = ModuleTestOutputEntry(path = newFile, moduleName = moduleName)
}

/**
 * Represents a project-level library
 */
internal data class ProjectLibraryEntry(
  override val path: Path,
  @JvmField val data: ProjectLibraryData,
  override val libraryFile: Path?,
  override val hash: Long,
  override val size: Int,
  override val relativeOutputFile: String?,
) : DistributionFileEntry, LibraryFileEntry {
  override val type: String
    get() = "project-library"

  override fun changePath(newFile: Path): ProjectLibraryEntry {
    return ProjectLibraryEntry(path = newFile,
                               data = data,
                               libraryFile = libraryFile,
                               hash = hash,
                               size = size,
                               relativeOutputFile = relativeOutputFile)
  }
}

/**
 * Represents production classes of a module
 */
data class ModuleOutputEntry(
  override val path: Path,
  @JvmField val moduleName: String,
  @JvmField val size: Int,
  override val hash: Long,
  override val relativeOutputFile: String,
  @JvmField val reason: String? = null,
) : DistributionFileEntry {
  override val type: String
    get() = "module-output"

  override fun changePath(newFile: Path): ModuleOutputEntry {
    return ModuleOutputEntry(path = newFile,
                             moduleName = moduleName,
                             size = size,
                             hash = hash,
                             relativeOutputFile = relativeOutputFile,
                             reason = reason)
  }
}