load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.searchEverywhereMl.ranking.yaml",
    srcs = ["src"],
    iml_files = ["intellij.searchEverywhereMl.ranking.yaml.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/search-everywhere-ml:intellij.searchEverywhereMl[module]",
        "//intellij-community/plugins/yaml:intellij.yaml[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/search-everywhere-ml/ranking:intellij.searchEverywhereMl.ranking[module]",
    ],
)
