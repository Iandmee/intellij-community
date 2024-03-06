load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.debugger.testFramework",
    srcs = ["src"],
    iml_files = ["intellij.platform.debugger.testFramework.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module]",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
