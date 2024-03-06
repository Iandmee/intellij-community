load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.refactorings.rename.k2",
    srcs = ["src"],
    iml_files = ["kotlin.refactorings.rename.k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/kotlin/fir:kotlin.fir[module, test]",
        "//intellij-community/plugins/kotlin/base/fir/code-insight:kotlin.base.fir.code-insight[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
        "//intellij-community/plugins/kotlin/frontend-independent/tests:kotlin.fir.frontend-independent.tests[module, test]",
        "//intellij-community:gson[test]",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.common[module]",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.k2[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/plugins/kotlin/kotlin.searching:kotlin.searching.k2[module]",
        "//intellij-community/plugins/kotlin/base/analysis-api/analysis-api-utils:kotlin.base.analysis-api.utils[module]",
        "//intellij-community/plugins/kotlin/code-insight/intentions-shared:kotlin.code-insight.intentions-shared[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
    ],
)
