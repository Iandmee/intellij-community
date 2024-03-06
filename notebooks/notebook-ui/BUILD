load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.notebooks.ui",
    srcs = ["src"],
    iml_files = ["intellij.notebooks.ui.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/code-style-api:intellij.platform.codeStyle[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
