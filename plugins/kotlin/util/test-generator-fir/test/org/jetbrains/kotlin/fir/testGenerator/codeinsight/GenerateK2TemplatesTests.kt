// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.kotlin.fir.testGenerator.codeinsight

import org.jetbrains.kotlin.idea.k2.codeInsight.postfix.test.AbstractK2PostfixTemplateTest
import org.jetbrains.kotlin.idea.liveTemplates.k2.macro.AbstractK2LiveTemplateTest
import org.jetbrains.kotlin.testGenerator.model.*

internal fun MutableTWorkspace.generateK2PostfixTemplateTests() {
    testGroup("code-insight/postfix-templates") {
        testClass<AbstractK2PostfixTemplateTest> {
            model("expansion", pattern = Patterns.KT_WITHOUT_DOTS, passTestDataPath = false)
        }
    }
}

internal fun MutableTWorkspace.generateK2LiveTemplateTests() {
    testGroup("code-insight/live-templates-k2") {
        testClass<AbstractK2LiveTemplateTest> {
            model("liveTemplates", pattern = Patterns.KT_WITHOUT_DOTS, passTestDataPath = false)
        }
    }
}
