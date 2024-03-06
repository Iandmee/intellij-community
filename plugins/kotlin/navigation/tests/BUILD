load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.navigation.tests",
    iml_files = ["kotlin.navigation.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/plugin/k2:kotlin.plugin.k2[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/plugins/kotlin/navigation:kotlin.navigation[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/plugins/kotlin/fir:kotlin.fir[module, test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/platform/core-api:intellij.platform.core[module, test]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module, test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:kotlinc.analysis-project-structure[test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community:kotlinc.high-level-api[test]",
        "//intellij-community:kotlinc.high-level-api-fir[test]",
    ],
)
