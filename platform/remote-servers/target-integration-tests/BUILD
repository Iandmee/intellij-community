load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.remoteServers.targetsIntegrationTests",
    iml_files = ["intellij.platform.remoteServers.targetsIntegrationTests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:assertJ",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:testcontainers[test]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module, test]",
        "//intellij-community/plugins/junit:intellij.junit[module, test]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
    ],
)
