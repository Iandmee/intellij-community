load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.lang.testEntities",
    iml_files = ["intellij.platform.lang.testEntities.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = [
        "gen",
        "testSrc",
    ],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
    ],
)
