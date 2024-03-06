load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jvm.analysis.internal.testFramework",
    srcs = ["src"],
    iml_files = ["intellij.jvm.analysis.internal.testFramework.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/jvm/jvm-analysis-impl:intellij.jvm.analysis.impl",
        "//intellij-community/jvm/jvm-analysis-testFramework:intellij.jvm.analysis.testFramework",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings",
        "//intellij-community/plugins/junit:intellij.junit",
        "//intellij-community/java/testFramework:intellij.java.testFramework",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jvm/jvm-analysis-impl:intellij.jvm.analysis.impl[module]",
        "//intellij-community/jvm/jvm-analysis-testFramework:intellij.jvm.analysis.testFramework[module]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/plugins/junit:intellij.junit[module, test]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
    ],
)
