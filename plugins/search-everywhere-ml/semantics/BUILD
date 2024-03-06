load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.searchEverywhereMl.semantics",
    srcs = ["src"],
    iml_files = ["intellij.searchEverywhereMl.semantics.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:caffeine",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//m2:commons-math3[test]",
        "//intellij-community/plugins/search-everywhere-ml:intellij.searchEverywhereMl[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community/platform/ml-embeddings:intellij.platform.ml.embeddings[module]",
    ],
)
