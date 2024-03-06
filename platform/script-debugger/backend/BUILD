load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.scriptDebugger.backend",
    srcs = ["src"],
    iml_files = ["intellij.platform.scriptDebugger.backend.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/script-debugger/protocol/protocol-reader-runtime:intellij.platform.scriptDebugger.protocolReaderRuntime[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community:fastutil-min",
        "//intellij-community:netty-buffer",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
    ],
)
