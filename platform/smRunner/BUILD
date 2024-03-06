load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.smRunner",
    srcs = ["src"],
    iml_files = ["intellij.platform.smRunner.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner",
        "//intellij-community:tcServiceMessages",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:tcServiceMessages",
        "//intellij-community:Objenesis[test]",
        "//intellij-community:easymock[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
