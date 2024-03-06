load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.injection.tests",
    iml_files = ["kotlin.base.injection.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community:kotlinc.high-level-api[test]",
        "//intellij-community/RegExpSupport:intellij.regexp[module, test]",
        "//intellij-community/plugins/IntelliLang:intellij.platform.langInjection[module, test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
    ],
)
