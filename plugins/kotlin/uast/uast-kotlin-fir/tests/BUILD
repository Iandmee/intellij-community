load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.uast.uast-kotlin-fir.tests",
    iml_files = ["kotlin.uast.uast-kotlin-fir.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/plugins/kotlin/fir:kotlin.fir",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-idea-fir:kotlin.uast.uast-kotlin-idea-fir",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/plugin/k2:kotlin.plugin.k2[module, test]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:ASM",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-base:kotlin.uast.uast-kotlin-base[module]",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-base/tests:kotlin.uast.uast-kotlin-base.tests[module, test]",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-fir:kotlin.uast.uast-kotlin-fir[module]",
        "//intellij-community:kotlinc.analysis-project-structure",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.high-level-api-fir",
        "//intellij-community:kotlinc.high-level-api-impl-base",
        "//intellij-community:kotlinc.high-level-api-impl-base-tests[test]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/uast/uast-java:intellij.java.uast[module]",
        "//intellij-community:kotlinc.kotlin-compiler-cli[test]",
        "//intellij-community:kotlinc.low-level-api-fir",
        "//intellij-community:kotlinc.analysis-api-providers",
        "//intellij-community:kotlinc.symbol-light-classes",
        "//intellij-community/uast/testFramework:intellij.platform.uast.testFramework[module, test]",
        "//intellij-community/plugins/kotlin/frontend-independent/tests:kotlin.fir.frontend-independent.tests[module, test]",
    ],
)
