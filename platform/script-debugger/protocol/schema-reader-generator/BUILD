load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.javascript.schemaReaderGenerator",
    srcs = ["src"],
    iml_files = ["intellij.javascript.schemaReaderGenerator.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:gson",
        "//intellij-community/platform/script-debugger/protocol/protocol-reader:intellij.javascript.protocolReader[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
    ],
)
