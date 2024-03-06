load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.remoteControl",
    srcs = ["src"],
    iml_files = ["intellij.remoteControl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:netty-buffer",
        "//intellij-community:netty-codec-http",
        "//intellij-community:gson",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module, test]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module, test]",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.tests[module, test]",
        "//intellij-community:assertJ[test]",
    ],
)
