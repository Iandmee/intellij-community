load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.code-insight.k1",
    srcs = ["src"],
    iml_files = ["kotlin.code-insight.k1.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/plugins/kotlin/base/fe10/analysis:kotlin.base.fe10.analysis[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
    ],
)
