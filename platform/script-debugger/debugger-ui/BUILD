load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.scriptDebugger.ui",
    srcs = ["src"],
    iml_files = ["intellij.platform.scriptDebugger.ui.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"testSrc": "org.jetbrains.debugger"},
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/execution-impl:intellij.platform.execution.impl"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/script-debugger/backend:intellij.platform.scriptDebugger.backend[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community/platform/xdebugger-testFramework:intellij.platform.debugger.testFramework[module, test]",
        "//intellij-community:fastutil-min",
        "//intellij-community:netty-buffer",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
