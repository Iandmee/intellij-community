load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.sh.copyright",
    srcs = ["src"],
    iml_files = ["intellij.sh.copyright.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/copyright:intellij.copyright[module]",
        "//intellij-community/plugins/sh/core:intellij.sh.core[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
    ],
)
