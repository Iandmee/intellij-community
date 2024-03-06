load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.copyright",
    srcs = ["src"],
    iml_files = ["intellij.python.copyright.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/copyright:intellij.copyright[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
    ],
)
