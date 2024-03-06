load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.dev.plugin",
    iml_files = ["intellij.dev.plugin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/plugins/dev/intellij.dev.plugin/noJava:intellij.dev.plugin.noJava",
        "//intellij-community/plugins/dev/intellij.java.dev",
        "//intellij-community/plugins/dev/intellij.groovy.dev",
        "//intellij-community/plugins/dev/intellij.kotlin.dev",
    ],
)
