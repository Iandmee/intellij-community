load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.evaluationPlugin.languages.python",
    srcs = ["src"],
    iml_files = ["intellij.evaluationPlugin.languages.python.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community/plugins/evaluation-plugin/languages:intellij.evaluationPlugin.languages[module]",
        "//intellij-community/plugins/evaluation-plugin/core:intellij.evaluationPlugin.core[module]",
    ],
)
