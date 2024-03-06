load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.testng.rt.tests",
    iml_files = ["intellij.testng.rt.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["src"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/plugins/testng:intellij.testng[module, test]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module, test]",
        "//intellij-community/aether-dependency-resolver:intellij.java.aetherDependencyResolver[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module, test]",
        "//intellij-community/plugins/testng_rt:intellij.testng.rt[module, test]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module, test]",
    ],
)
