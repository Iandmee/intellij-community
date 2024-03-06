load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.plugin",
    iml_files = ["intellij.devkit.plugin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/plugins/devkit/intellij.devkit.plugin/noKotlin:intellij.devkit.plugin.noKotlin",
        "//intellij-community/plugins/devkit/intellij.kotlin.devkit",
    ],
    deps = ["//intellij-community/plugins/devkit/devkit-kotlin-tests:intellij.devkit.kotlin.tests[module, test]"],
)
