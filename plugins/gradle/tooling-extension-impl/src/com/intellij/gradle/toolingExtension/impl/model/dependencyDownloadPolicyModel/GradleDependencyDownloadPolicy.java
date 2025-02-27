// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.gradle.toolingExtension.impl.model.dependencyDownloadPolicyModel;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public interface GradleDependencyDownloadPolicy {

  boolean isDownloadSources();

  boolean isDownloadJavadoc();
}
