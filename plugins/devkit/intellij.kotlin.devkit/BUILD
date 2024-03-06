load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.kotlin.devkit",
    srcs = ["src"],
    iml_files = ["intellij.kotlin.devkit.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.idea.devkit.kotlin"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/java/java-analysis-api:intellij.java.analysis[module]",
        "//intellij-community/plugins/kotlin/code-insight/intentions-shared:kotlin.code-insight.intentions-shared[module]",
        "//intellij-community/plugins/kotlin/code-insight/utils:kotlin.code-insight.utils[module]",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/base/fe10/code-insight:kotlin.base.fe10.code-insight[module]",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.common[module]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/code-insight/api:kotlin.code-insight.api[module]",
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/indices:kotlin.base.indices[module]",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-base:kotlin.uast.uast-kotlin-base[module]",
    ],
)
