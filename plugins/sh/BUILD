load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.sh",
    iml_files = ["intellij.sh.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/sh/core:intellij.sh.core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/sh/core:intellij.sh.core[module]",
        "//intellij-community/plugins/sh/terminal:intellij.sh.terminal[module]",
        "//intellij-community/plugins/sh/copyright:intellij.sh.copyright[module]",
        "//intellij-community/plugins/sh/markdown:intellij.sh.markdown[module]",
        "//intellij-community/plugins/sh/python:intellij.sh.python[module]",
    ],
)
