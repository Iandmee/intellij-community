load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.structuralSearch",
    srcs = ["src"],
    iml_files = ["intellij.groovy.structuralSearch.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/structuralsearch:intellij.platform.structuralSearch[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/plugins/groovy:intellij.groovy[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/structuralsearch:intellij.platform.structuralSearch.tests[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/platform/duplicates-analysis:intellij.platform.duplicates.analysis[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
