// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.kotlin.nj2k

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import org.jetbrains.annotations.ApiStatus
import org.jetbrains.kotlin.j2k.ConverterContext
import org.jetbrains.kotlin.nj2k.externalCodeProcessing.NewExternalCodeProcessing
import org.jetbrains.kotlin.nj2k.types.JKTypeFactory

@ApiStatus.Internal
data class NewJ2kConverterContext internal constructor(
    internal val symbolProvider: JKSymbolProvider,
    internal val typeFactory: JKTypeFactory,
    val converter: NewJavaToKotlinConverter,
    val inConversionContext: (PsiElement) -> Boolean,
    val importStorage: JKImportStorage,
    val elementsInfoStorage: JKElementInfoStorage,
    val externalCodeProcessor: NewExternalCodeProcessing,
    val functionalInterfaceConversionEnabled: Boolean
) : ConverterContext {
    val project: Project
        get() = converter.project
}
