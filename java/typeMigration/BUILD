load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.typeMigration",
    srcs = ["src"],
    iml_files = ["intellij.java.typeMigration.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/platform/structuralsearch:intellij.platform.structuralSearch[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/structuralsearch-java:intellij.java.structuralSearch[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module, test]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
    ],
)
