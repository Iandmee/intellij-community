load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.terminal",
    srcs = ["src"],
    iml_files = ["intellij.python.terminal.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community/plugins/terminal:intellij.terminal[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:mockito[test]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
    ],
)
