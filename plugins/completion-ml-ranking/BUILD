load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.completionMlRanking",
    srcs = ["src"],
    iml_files = ["intellij.completionMlRanking.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:ngram-slp",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:caffeine",
        "//intellij-community:jackson-jr-objects",
        "//intellij-community:jackson",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/ml-api:intellij.platform.ml[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community/platform/diagnostic/telemetry-impl:intellij.platform.diagnostic.telemetry.impl[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.completionMlRanking.tests",
    iml_files = ["intellij.completionMlRanking.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking[module, test]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:ngram-slp",
        "//intellij-community/platform/ml-api:intellij.platform.ml[module, test]",
    ],
)
