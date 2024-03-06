load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.statsCollector",
    srcs = ["src"],
    iml_files = ["intellij.statsCollector.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking[module]",
        "//intellij-community:http-client",
        "//intellij-community:Guava",
        "//intellij-community:gson",
        "//m2:completion-log-events",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.statsCollector.tests",
    iml_files = ["intellij.statsCollector.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community:mockito[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:commons-codec[test]",
        "//intellij-community/plugins/stats-collector:intellij.statsCollector[module, test]",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking[module, test]",
        "//m2:completion-log-events[test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
