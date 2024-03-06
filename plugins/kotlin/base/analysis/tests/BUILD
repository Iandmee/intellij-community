load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.analysis.tests",
    iml_files = ["kotlin.base.analysis.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:JUnit3[test]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
    ],
)
