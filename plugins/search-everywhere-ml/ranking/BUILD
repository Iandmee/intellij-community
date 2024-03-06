load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.searchEverywhereMl.ranking",
    srcs = ["src"],
    iml_files = ["intellij.searchEverywhereMl.ranking.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/statistics:intellij.platform.statistics"],
    runtime_deps = ["//intellij-community/plugins/search-everywhere-ml/typos:intellij.searchEverywhereMl.typos"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:caffeine",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/json:intellij.json[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//m2:find-action-model",
        "//m2:find-action-model-experimental",
        "//m2:find-file-model",
        "//m2:find-file-model-experimental",
        "//m2:find-classes-model",
        "//m2:find-classes-model-experimental",
        "//m2:find-all-model-experimental",
        "//intellij-community/plugins/search-everywhere-ml:intellij.searchEverywhereMl[module]",
    ],
)
