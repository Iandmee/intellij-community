load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.uast.tests",
    iml_files = ["intellij.platform.uast.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/uast/uast-common:intellij.platform.uast",
        "//intellij-community/uast/uast-java-ide:intellij.java.uast.ide",
        "//intellij-community/uast/testFramework:intellij.platform.uast.testFramework",
    ],
    runtime_deps = ["//intellij-community/java/java-tests:intellij.java.tests"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:JUnit4",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/uast/uast-java-ide:intellij.java.uast.ide[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community/uast/testFramework:intellij.platform.uast.testFramework[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
