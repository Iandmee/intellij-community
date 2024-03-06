load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.refactorings.k2",
    srcs = ["src"],
    iml_files = ["kotlin.refactorings.k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.common[module]",
        "//intellij-community/plugins/kotlin/kotlin.searching:kotlin.searching.k2[module]",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.introduce.k2[module]",
        "//intellij-community/plugins/kotlin/base/analysis-api/analysis-api-utils:kotlin.base.analysis-api.utils[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/base/kdoc:kotlin.base.kdoc[module]",
    ],
)
