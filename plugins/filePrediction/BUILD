load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.filePrediction",
    srcs = ["src"],
    iml_files = ["intellij.filePrediction.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_resources = ["testData"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/platform/vcs-log/api:intellij.platform.vcs.log[module]",
        "//intellij-community/platform/vcs-log/impl:intellij.platform.vcs.log.impl[module]",
        "//intellij-community/plugins/git4idea:intellij.vcs.git[module]",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//m2:file-prediction-model",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/statistics/uploader:intellij.platform.statistics.uploader[module, test]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module]",
        "//intellij-community:ngram-slp",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
    ],
)
