load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.ae.database.community",
    iml_files = ["intellij.ae.database.community.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/feature-usage-database/core:intellij.ae.database.core[module]",
        "//intellij-community/plugins/feature-usage-database/counters:intellij.ae.database.counters.community[module]",
    ],
)
