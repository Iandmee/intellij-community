load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.searchEverywhereMl.semantics.testCommands",
    srcs = ["src"],
    iml_files = ["intellij.searchEverywhereMl.semantics.testCommands.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/plugins/performanceTesting:intellij.performanceTesting[module]",
        "//intellij-community/plugins/search-everywhere-ml/semantics:intellij.searchEverywhereMl.semantics[module]",
        "//intellij-community/platform/ml-embeddings:intellij.platform.ml.embeddings[module]",
    ],
)
