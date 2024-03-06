load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.builtInServer.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.builtInServer.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community:Guava",
        "//intellij-community:gson",
        "//intellij-community:commons-imaging",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:netty-codec-http",
        "//intellij-community:fastutil-min",
        "//intellij-community:jackson",
        "//intellij-community:netty-buffer",
        "//intellij-community:caffeine",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community:kotlinx-coroutines-core",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.builtInServer.tests",
    iml_files = ["intellij.platform.builtInServer.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community:Guava",
        "//intellij-community:gson",
        "//intellij-community:commons-imaging",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl[module]",
        "//intellij-community:netty-codec-http[test]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:netty-buffer",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module, test]",
    ],
)
