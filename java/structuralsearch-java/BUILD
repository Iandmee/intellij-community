load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.structuralSearch",
    srcs = ["src"],
    iml_files = ["intellij.java.structuralSearch.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/structuralsearch:intellij.platform.structuralSearch[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/platform/duplicates-analysis:intellij.platform.duplicates.analysis[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
    ],
)
