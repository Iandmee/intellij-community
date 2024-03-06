load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.copyright.fir.tests",
    iml_files = ["kotlin.copyright.fir.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/plugin/k2:kotlin.plugin.k2[module, test]",
        "//intellij-community/plugins/kotlin/copyright/tests:kotlin.copyright.tests[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
    ],
)
