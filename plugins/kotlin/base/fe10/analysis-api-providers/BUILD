load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.fe10.analysis-api-providers",
    srcs = ["src"],
    iml_files = ["kotlin.base.fe10.analysis-api-providers.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.analysis-project-structure",
        "//intellij-community:kotlinc.analysis-api-providers",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/plugins/kotlin/base/analysis-api-providers:kotlin.base.analysis-api-providers[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
    ],
)
