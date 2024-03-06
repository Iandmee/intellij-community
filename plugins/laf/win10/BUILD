load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.laf.win10",
    srcs = ["src"],
    iml_files = ["intellij.laf.win10.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:Java_Compatibility",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
