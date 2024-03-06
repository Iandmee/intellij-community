load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.grazie",
    srcs = ["src"],
    iml_files = ["intellij.python.grazie.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/grazie:intellij.grazie[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
    ],
)
