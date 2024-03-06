load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.navigation",
    srcs = ["src"],
    iml_files = ["kotlin.navigation.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resouces"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/plugins/kotlin/base/indices:kotlin.base.indices[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.analysis-project-structure",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
    ],
)
