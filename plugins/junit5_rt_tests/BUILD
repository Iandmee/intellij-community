load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.junit.v5.rt.tests",
    iml_files = ["intellij.junit.v5.rt.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/junit5_rt:intellij.junit.v5.rt[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module, test]",
        "//intellij-community/plugins/junit:intellij.junit[module, test]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/aether-dependency-resolver:intellij.java.aetherDependencyResolver[module, test]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module, test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community:JUnit5Launcher[test]",
        "//intellij-community:StreamEx[test]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module, test]",
        "//intellij-community:JUnit5Jupiter[test]",
        "//intellij-community:JUnit5Vintage[test]",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
    ],
)
