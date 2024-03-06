load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.coverage.tests",
    iml_files = ["kotlin.coverage.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/plugins/kotlin/uast/uast-kotlin:kotlin.uast.uast-kotlin",
        "//intellij-community/plugins/kotlin/gradle/gradle:kotlin.gradle.gradle",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-tests",
        "//intellij-community:JUnit4",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module]",
        "//intellij-community/plugins/kotlin/jvm:kotlin.jvm[module]",
        "//intellij-community/plugins/kotlin/coverage:kotlin.coverage[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/plugins/coverage:intellij.java.coverage[module]",
    ],
)
