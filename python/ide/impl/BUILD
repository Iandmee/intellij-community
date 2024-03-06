load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.pycharm.community.ide.impl",
    srcs = ["src"],
    iml_files = ["intellij.pycharm.community.ide.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/xml/dom-impl:intellij.xml.dom.impl"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community:Guava",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/plugins/ide-features-trainer:intellij.featuresTrainer[module]",
        "//intellij-community/python/python-features-trainer:intellij.python.featuresTrainer[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:http-client",
    ],
)
