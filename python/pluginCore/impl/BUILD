load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community.plugin.impl",
    srcs = ["src"],
    iml_files = ["intellij.python.community.plugin.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
