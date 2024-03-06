load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.terminal.completion",
    srcs = ["src"],
    iml_files = ["intellij.terminal.completion.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//m2:terminal-completion-spec"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//m2:terminal-completion-spec",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
