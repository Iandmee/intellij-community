load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.code-insight.tests-k2",
    iml_files = ["kotlin.base.code-insight.tests-k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/kotlin/plugin/k2:kotlin.plugin.k2"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community:kotlinc.high-level-api[test]",
        "//intellij-community:kotlinc.high-level-api-impl-base[test]",
        "//intellij-community:kotlinc.high-level-api-fe10[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module, test]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module, test]",
        "//intellij-community/plugins/kotlin/base/test:kotlin.base.test[module, test]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module, test]",
    ],
)
