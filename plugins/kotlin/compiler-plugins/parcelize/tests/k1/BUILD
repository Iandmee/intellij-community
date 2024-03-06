load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-plugins.parcelize.tests.k1",
    iml_files = ["kotlin.compiler-plugins.parcelize.tests.k1.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/kotlin/base/test:kotlin.base.test[module, test]",
        "//intellij-community/plugins/kotlin/compiler-plugins/parcelize/tests:kotlin.compiler-plugins.parcelize.tests[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
    ],
)
