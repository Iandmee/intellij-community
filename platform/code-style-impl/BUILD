load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.codeStyle.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.codeStyle.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/code-style-api:intellij.platform.codeStyle[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:StreamEx",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
    ],
)
