load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jvm.analysis.impl",
    srcs = ["src"],
    iml_files = ["intellij.jvm.analysis.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/jvm/jvm-analysis-api:intellij.jvm.analysis"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jvm/jvm-analysis-api:intellij.jvm.analysis[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/jvm/jvm-analysis-quickFix:intellij.jvm.analysis.quickFix[module]",
    ],
)
