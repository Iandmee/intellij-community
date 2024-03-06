load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.uast.uast-kotlin-base.tests",
    iml_files = ["kotlin.uast.uast-kotlin-base.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-base:kotlin.uast.uast-kotlin-base[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module, test]",
        "//intellij-community/uast/testFramework:intellij.platform.uast.testFramework[module, test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community:kotlinc.kotlin-compiler-cli[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
    ],
)
