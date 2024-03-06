load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.sh.tests",
    iml_files = ["intellij.sh.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/sh:intellij.sh[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
