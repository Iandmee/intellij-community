load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-reference-index.tests.k2",
    iml_files = ["kotlin.compiler-reference-index.tests.k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/plugins/kotlin/compiler-reference-index:kotlin.compiler-reference-index[module]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/kotlin/compiler-reference-index/tests:kotlin.compiler-reference-index.tests[module, test]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/code-insight/line-markers:kotlin.code-insight.line-markers-k2[module, test]",
    ],
)
