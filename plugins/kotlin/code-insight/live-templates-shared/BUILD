load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.code-insight.live-templates-shared",
    srcs = ["src"],
    iml_files = ["kotlin.code-insight.live-templates-shared.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/highlighting/highlighting-shared:kotlin.highlighting.shared[module]",
        "//intellij-community/plugins/kotlin/base/analysis-api/analysis-api-utils:kotlin.base.analysis-api.utils[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/code-insight/override-implement-shared:kotlin.code-insight.override-implement-shared[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
    ],
)
