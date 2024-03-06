load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jvm.analysis.refactoring",
    srcs = ["src"],
    iml_files = ["intellij.jvm.analysis.refactoring.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/jvm/jvm-analysis-api:intellij.jvm.analysis[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
    ],
)
