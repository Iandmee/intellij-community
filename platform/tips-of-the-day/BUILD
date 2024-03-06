load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.tips",
    srcs = ["src"],
    iml_files = ["intellij.platform.tips.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:jsoup",
        "//intellij-community:fastutil-min",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community/platform/feedback:intellij.platform.feedback[module]",
    ],
)
