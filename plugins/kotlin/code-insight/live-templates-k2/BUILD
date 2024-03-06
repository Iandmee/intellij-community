load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.code-insight.live-templates-k2",
    srcs = ["src"],
    iml_files = ["kotlin.code-insight.live-templates-k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community/plugins/kotlin/base/analysis-api/analysis-api-utils:kotlin.base.analysis-api.utils[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/code-insight/live-templates-shared:kotlin.code-insight.live-templates-shared[module]",
        "//intellij-community/plugins/kotlin/completion/impl-k2:kotlin.completion.impl-k2[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
    ],
)
