load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.vcs.changeReminder",
    srcs = ["src"],
    iml_files = ["intellij.vcs.changeReminder.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/vcs-log/graph:intellij.platform.vcs.log.graph.impl[module]",
        "//intellij-community/platform/vcs-log/impl:intellij.platform.vcs.log.impl[module]",
        "//intellij-community/platform/vcs-log/api:intellij.platform.vcs.log[module]",
        "//intellij-community/plugins/git4idea:intellij.vcs.git[module]",
        "//m2:change-reminder-prediction-model",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
