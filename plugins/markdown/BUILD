load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown",
    iml_files = ["intellij.markdown.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/markdown/core:intellij.markdown.core"],
    deps = ["//intellij-community/plugins/markdown/core:intellij.markdown.core[module]"],
)
