load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.util.test-generator-all",
    iml_files = ["kotlin.util.test-generator-all.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/plugins/kotlin/util/test-generator-fir:kotlin.util.test-generator-fir[module, test]",
        "//intellij-community/plugins/kotlin/util/test-generator-fe10:kotlin.util.test-generator-fe10[module, test]",
        "//intellij-community:JUnit4[test]",
    ],
)
