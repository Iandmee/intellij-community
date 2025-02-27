// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.configurationStore

import org.jetbrains.annotations.ApiStatus.Internal

/**
 * Service, which implements this interfaces, will be asked to [save] custom settings (in their own custom way)
 * when application (for Application level services) or project (for Project level services) is invoked.
 */
@Internal
interface SettingsSavingComponent {
  suspend fun save()
}

interface SettingsSavingComponentJavaAdapter : SettingsSavingComponent {
  override suspend fun save() {
    doSave()
  }

  fun doSave()
}