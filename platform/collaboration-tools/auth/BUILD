load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.collaborationTools.auth",
    srcs = ["src"],
    iml_files = ["intellij.platform.collaborationTools.auth.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community:netty-buffer",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl[module]",
    ],
)
