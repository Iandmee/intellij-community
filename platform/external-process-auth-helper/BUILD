load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.externalProcessAuthHelper",
    srcs = ["src"],
    iml_files = ["intellij.platform.externalProcessAuthHelper.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:commons-codec",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community/platform/external-process-auth-helper/rt:intellij.platform.externalProcessAuthHelper.rt[module]",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community:netty-buffer",
    ],
)
