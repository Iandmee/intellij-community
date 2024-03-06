load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.frontback.tests",
    iml_files = ["intellij.java.frontback.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:easymock",
        "//intellij-community:mockito",
        "//intellij-community:assertJ",
        "//intellij-community:kotlin-test",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5",
        "//intellij-community/platform/platform-tests:intellij.platform.tests",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:easymock[test]",
        "//intellij-community:mockito[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/java/java-frontback-psi-impl:intellij.java.frontback.psi.impl[module]",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module, test]",
        "//intellij-community/java/java-frontback-impl:intellij.java.frontback.impl[module, test]",
        "//intellij-community/platform/platform-tests:intellij.platform.tests[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
