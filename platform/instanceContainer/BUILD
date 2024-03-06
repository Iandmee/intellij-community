load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.instanceContainer",
    srcs = ["src"],
    iml_files = ["intellij.platform.instanceContainer.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij.platform.instanceContainer"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.instanceContainer.tests",
    iml_files = ["intellij.platform.instanceContainer.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"tests": "com.intellij.platform.instanceContainer.tests"},
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community/platform/instanceContainer:intellij.platform.instanceContainer[module, test]",
        "//intellij-community/platform/testFramework/common:intellij.platform.testFramework.common[module, test]",
    ],
)
