load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.rareRefactorings",
    srcs = ["src"],
    iml_files = ["intellij.java.rareRefactorings.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community:StreamEx",
        "//intellij-community:fastutil-min",
    ],
)
