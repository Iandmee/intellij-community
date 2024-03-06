load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-plugins.parcelize.tests.k2",
    iml_files = ["kotlin.compiler-plugins.parcelize.tests.k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community:kotlinc.kotlin-compiler-fir[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:kotlinc.high-level-api[test]",
        "//intellij-community:kotlinc.parcelize-compiler-plugin[test]",
        "//intellij-community/plugins/kotlin/code-insight/inspections-k2/tests:kotlin.code-insight.inspections-k2.tests[module, test]",
        "//intellij-community/plugins/kotlin/compiler-plugins/parcelize/k2:kotlin.compiler-plugins.parcelize.k2[module, test]",
        "//intellij-community/plugins/kotlin/compiler-plugins/parcelize/tests:kotlin.compiler-plugins.parcelize.tests[module, test]",
        "//intellij-community/plugins/kotlin/plugin/k2:kotlin.plugin.k2[module, test]",
        "//intellij-community/plugins/kotlin/base/test:kotlin.base.test[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
    ],
)
