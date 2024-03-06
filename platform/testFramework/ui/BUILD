load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.testFramework.ui",
    srcs = ["src"],
    iml_files = ["intellij.platform.testFramework.ui.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//m2:intellij.remoterobot.remote.fixtures",
        "//m2:intellij.remoterobot.robot.server.core",
    ],
    runtime_deps = ["//intellij-community:okhttp"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/platform-resources:intellij.platform.resources[module]",
        "//m2:intellij.remoterobot.remote.fixtures",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community:netty-buffer",
        "//m2:intellij.remoterobot.robot.server.core",
        "//intellij-community:gson",
    ],
)
