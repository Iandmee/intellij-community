load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.javascript.protocolModelGenerator",
    # do not sort: must match IML order
    srcs = [
        "src",
        "generated",
    ],
    iml_files = ["intellij.javascript.protocolModelGenerator.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.protocolModelGenerator"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:gson",
        "//intellij-community/platform/script-debugger/protocol/schema-reader-generator:intellij.javascript.schemaReaderGenerator[module]",
        "//intellij-community/platform/script-debugger/protocol/protocol-reader:intellij.javascript.protocolReader[module]",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:kotlin-stdlib",
    ],
)
