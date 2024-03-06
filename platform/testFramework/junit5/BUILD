load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.testFramework.junit5",
    srcs = ["src"],
    iml_files = ["intellij.platform.testFramework.junit5.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {
        "test": "com.intellij.testFramework.junit5",
        "src": "com.intellij.testFramework.junit5",
    },
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/testFramework/common:intellij.platform.testFramework.common"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:JUnit5",
        "//intellij-community:JUnit5Launcher",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/testFramework/common:intellij.platform.testFramework.common[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
    ],
)
