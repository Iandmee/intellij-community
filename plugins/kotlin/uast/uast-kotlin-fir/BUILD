load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.uast.uast-kotlin-fir",
    srcs = ["src"],
    iml_files = ["kotlin.uast.uast-kotlin-fir.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:ASM",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-base:kotlin.uast.uast-kotlin-base[module]",
        "//intellij-community:kotlinc.analysis-project-structure",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.high-level-api-fir",
        "//intellij-community:kotlinc.high-level-api-impl-base",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/uast/uast-java:intellij.java.uast[module]",
        "//intellij-community:kotlinc.low-level-api-fir",
        "//intellij-community:kotlinc.analysis-api-providers",
        "//intellij-community:kotlinc.symbol-light-classes",
    ],
)
