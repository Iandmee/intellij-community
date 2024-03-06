load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.evaluationPlugin",
    srcs = ["src"],
    iml_files = ["intellij.evaluationPlugin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/evaluation-plugin/languages:intellij.evaluationPlugin.languages[module]",
        "//intellij-community/plugins/evaluation-plugin/core:intellij.evaluationPlugin.core[module]",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking[module]",
        "//intellij-community/plugins/stats-collector:intellij.statsCollector[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module]",
        "//intellij-community/platform/ml-api:intellij.platform.ml[module]",
        "//intellij-community:clikt",
        "//intellij-community:gson",
        "//intellij-community:commons-text",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.evaluationPlugin.tests",
    iml_files = ["intellij.evaluationPlugin.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/plugins/evaluation-plugin/core:intellij.evaluationPlugin.core[module, test]",
        "//intellij-community/plugins/evaluation-plugin:intellij.evaluationPlugin[module, test]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module, test]",
        "//intellij-community:mockito[test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community:gson[test]",
    ],
)
