load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.workspace.storage.tests",
    iml_files = ["intellij.platform.workspace.storage.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_friends = ["//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage"],
    test_resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/workspace/storage/testEntities:intellij.platform.workspace.storage.testEntities[module, test]",
        "//intellij-community:Guava[test]",
        "//intellij-community:kotlin-reflect[test]",
        "//intellij-community:fastutil-min[test]",
        "//intellij-community:kotlin-test",
        "//intellij-community:Kryo5",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
    ],
)
