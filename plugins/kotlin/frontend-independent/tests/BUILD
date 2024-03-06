load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.fir.frontend-independent.tests",
    iml_files = ["kotlin.fir.frontend-independent.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/platform/util:intellij.platform.util[module, test]",
        "//intellij-community:slf4j-api[test]",
    ],
)
