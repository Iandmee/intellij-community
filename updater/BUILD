load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.updater",
    srcs = ["src"],
    iml_files = ["intellij.platform.updater.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jna",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:assertJ[test]",
    ],
)
