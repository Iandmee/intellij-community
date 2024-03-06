load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.langInjection",
    srcs = ["src"],
    iml_files = ["intellij.python.langInjection.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/plugins/IntelliLang:intellij.platform.langInjection[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
    ],
)
