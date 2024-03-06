load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.onboarding",
    srcs = ["src"],
    iml_files = ["kotlin.onboarding.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/plugins/stats-collector:intellij.statsCollector[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/feedback:intellij.platform.feedback[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community:kotlinx-datetime-jvm",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:kotlin-test-assertions-core-jvm[test]",
        "//intellij-community:kotlin-test-junit[test]",
        "//intellij-community:JUnit5[test]",
    ],
)
