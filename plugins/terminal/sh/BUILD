load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.terminal.sh",
    srcs = ["src"],
    iml_files = ["intellij.terminal.sh.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/platform/localIde:intellij.platform.localIde"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/plugins/terminal:intellij.terminal[module]",
        "//intellij-community/plugins/sh:intellij.sh[module]",
    ],
)
