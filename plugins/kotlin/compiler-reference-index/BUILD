load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-reference-index",
    srcs = ["src"],
    iml_files = ["kotlin.compiler-reference-index.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/compiler-configuration:kotlin.base.compiler-configuration[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/java/java-indexing-impl:intellij.java.indexing.impl[module]",
        "//intellij-community/java/compiler/impl:intellij.java.compiler.impl[module]",
    ],
)
