load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jvm.analysis.kotlin.tests",
    iml_files = ["intellij.jvm.analysis.kotlin.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/plugin/common:kotlin.plugin.common[module, test]",
        "//intellij-community/jvm/jvm-analysis-internal-testFramework:intellij.jvm.analysis.internal.testFramework[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/java/java-impl-inspections:intellij.java.impl.inspections[module, test]",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
    ],
)
