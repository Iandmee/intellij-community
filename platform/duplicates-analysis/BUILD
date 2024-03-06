load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.duplicates.analysis",
    srcs = ["src"],
    iml_files = ["intellij.platform.duplicates.analysis.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl",
        "//intellij-community/platform/extensions:intellij.platform.extensions",
        "//intellij-community/platform/util:intellij.platform.util",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
