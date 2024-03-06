load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.dev",
    srcs = ["src"],
    iml_files = ["intellij.groovy.dev.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.idea.dev.groovy"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/dev/intellij.dev.codeInsight[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/plugins/groovy/groovy-psi:intellij.groovy.psi[module]",
    ],
)
