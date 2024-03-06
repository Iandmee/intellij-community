load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.coverage",
    srcs = ["src"],
    iml_files = ["intellij.java.coverage.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/plugins/coverage-common:intellij.platform.coverage",
        "//intellij-community/java/execution/openapi:intellij.java.execution",
        "//intellij-community/java/openapi:intellij.java",
    ],
    # do not sort: must match IML order
    deps = [
        "//m2:JaCoCo",
        "//intellij-community/plugins/coverage-common:intellij.platform.coverage[module]",
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module]",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner[module]",
        "//intellij-community/plugins/testng_rt:intellij.testng.rt[module]",
        "//intellij-community/plugins/junit_rt:intellij.junit.rt[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/plugins/coverage/coverage_rt:intellij.java.coverage.rt[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:intellij-coverage",
        "//m2:coverage-report",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:fastutil-min",
    ],
)
