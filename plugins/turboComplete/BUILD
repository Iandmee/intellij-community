load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.turboComplete",
    srcs = ["src"],
    iml_files = ["intellij.turboComplete.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module]",
        "//intellij-community/platform/ml-api:intellij.platform.ml[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.turboComplete.tests",
    iml_files = ["intellij.turboComplete.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit5[test]",
        "//intellij-community/plugins/turboComplete:intellij.turboComplete[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module, test]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module, test]",
    ],
)
