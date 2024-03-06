load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.scriptDebugger.protocolReaderRuntime",
    srcs = ["src"],
    iml_files = ["intellij.platform.scriptDebugger.protocolReaderRuntime.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:gson"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:gson",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community:fastutil-min",
        "//intellij-community:netty-buffer",
    ],
)
