load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.javascript.protocolReader",
    srcs = ["src"],
    iml_files = ["intellij.javascript.protocolReader.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.protocolReader"},
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/script-debugger/protocol/protocol-reader-runtime:intellij.platform.scriptDebugger.protocolReaderRuntime"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:gson",
        "//intellij-community/platform/script-debugger/protocol/protocol-reader-runtime:intellij.platform.scriptDebugger.protocolReaderRuntime[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect",
    ],
)
