load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jvm.analysis.quickFix",
    srcs = ["src"],
    iml_files = ["intellij.jvm.analysis.quickFix.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/jvm/jvm-analysis-refactoring:intellij.jvm.analysis.refactoring"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/jvm/jvm-analysis-refactoring:intellij.jvm.analysis.refactoring[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
    ],
)
