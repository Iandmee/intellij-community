load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.util.test-generator-api",
    iml_files = ["kotlin.util.test-generator-api.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:kotlin-reflect[test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module, test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
    ],
)
