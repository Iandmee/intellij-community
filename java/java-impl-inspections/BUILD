load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.impl.inspections",
    srcs = ["src"],
    iml_files = ["intellij.java.impl.inspections.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl[module]",
        "//intellij-community:StreamEx",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community:ASM",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util/text-matching:intellij.platform.util.text.matching[module]",
    ],
)
