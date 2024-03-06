load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.toml.tests",
    iml_files = ["intellij.toml.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["src/test/resources"],
    test_srcs = ["src/test/kotlin"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/toml:intellij.toml[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community/plugins/grazie/src/test:intellij.grazie.tests[module, test]",
    ],
)
