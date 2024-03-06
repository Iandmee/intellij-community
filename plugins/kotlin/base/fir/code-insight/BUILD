load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.fir.code-insight",
    srcs = ["src"],
    iml_files = ["kotlin.base.fir.code-insight.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.kotlin-compiler-fir",
        "//intellij-community:kotlinc.kotlin-compiler-ir",
        "//intellij-community:kotlinc.analysis-project-structure",
        "//intellij-community:kotlinc.low-level-api-fir",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.analysis-api-providers",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/indices:kotlin.base.indices[module]",
        "//intellij-community/plugins/kotlin/base/platforms:kotlin.base.platforms[module]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/base/facet:kotlin.base.facet[module]",
        "//intellij-community/plugins/kotlin/base/analysis-api/analysis-api-utils:kotlin.base.analysis-api.utils[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
    ],
)
