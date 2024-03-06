load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.ide.newUiOnboarding",
    srcs = ["src"],
    iml_files = ["intellij.platform.ide.newUiOnboarding.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/execution:intellij.platform.execution[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community:jcef",
    ],
)
