load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.dev.plugin.noJava",
    iml_files = ["intellij.dev.plugin.noJava.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/plugins/dev/intellij.dev",
        "//intellij-community/plugins/dev/intellij.dev.codeInsight",
        "//intellij-community/plugins/dev/intellij.dev.psiViewer",
        "//intellij-community/platform/statistics/devkit:intellij.platform.statistics.devkit",
    ],
)
