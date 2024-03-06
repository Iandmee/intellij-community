load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.performanceTesting.remoteDriver",
    srcs = ["src"],
    iml_files = ["intellij.performanceTesting.remoteDriver.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/performanceTesting:intellij.performanceTesting[module]",
        "//intellij-community:assertJ",
        "//intellij-community:assertj-swing",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl[module]",
        "//intellij-community:netty-buffer",
        "//intellij-community:netty-codec-http",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/remote-driver/model:intellij.driver.model[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
    ],
)
