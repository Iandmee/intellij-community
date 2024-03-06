load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.refactorings.common",
    srcs = ["src"],
    iml_files = ["kotlin.refactorings.common.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic"],
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
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/base/kdoc:kotlin.base.kdoc[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/plugins/kotlin/code-insight/utils:kotlin.code-insight.utils[module]",
        "//intellij-community:Guava",
    ],
)
