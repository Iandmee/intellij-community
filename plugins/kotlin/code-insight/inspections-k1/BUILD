load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.code-insight.inspections-k1",
    srcs = ["src"],
    iml_files = ["kotlin.code-insight.inspections-k1.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/formatter:kotlin.formatter[module]",
        "//intellij-community/plugins/kotlin/code-insight/api:kotlin.code-insight.api[module]",
        "//intellij-community/plugins/kotlin/code-insight/utils:kotlin.code-insight.utils[module]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/code-insight/impl-base:kotlin.code-insight.impl-base[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/kotlin/code-insight/inspections-shared:kotlin.code-insight.inspections-shared[module]",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/plugins/kotlin/base/fe10/analysis:kotlin.base.fe10.analysis[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
    ],
)
