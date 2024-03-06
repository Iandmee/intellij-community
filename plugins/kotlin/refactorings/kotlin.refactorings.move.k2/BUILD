load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.refactorings.move.k2",
    srcs = ["src"],
    iml_files = ["kotlin.refactorings.move.k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:gson[test]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/fir:kotlin.fir[module]",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.k2[module]",
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.common[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
        "//intellij-community/plugins/kotlin/base/test:kotlin.base.test[module, test]",
        "//intellij-community/plugins/kotlin/base/analysis-api/analysis-api-utils:kotlin.base.analysis-api.utils[module]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module]",
    ],
)
