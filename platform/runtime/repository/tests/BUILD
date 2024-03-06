load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.runtime.repository.tests",
    iml_files = ["intellij.platform.runtime.repository.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"testSrc": "com.intellij.platform.runtime.repository"},
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/runtime/repository:intellij.platform.runtime.repository[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
