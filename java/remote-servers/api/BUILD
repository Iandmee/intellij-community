load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.remoteServers",
    srcs = ["src"],
    iml_files = ["intellij.java.remoteServers.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/remote-servers/api:intellij.platform.remoteServers"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/remote-servers/api:intellij.platform.remoteServers[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
    ],
)
