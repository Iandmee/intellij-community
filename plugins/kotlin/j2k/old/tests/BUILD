load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.j2k.old.tests",
    iml_files = ["kotlin.j2k.old.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin:kotlin.uast.uast-kotlin",
        "//intellij-community/plugins/kotlin/gradle/gradle:kotlin.gradle.gradle",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module, test]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/j2k/idea:kotlin.j2k.idea[module, test]",
        "//intellij-community/plugins/kotlin/j2k/old:kotlin.j2k.old[module, test]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module, test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
    ],
)
