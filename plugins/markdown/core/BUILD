load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown.core",
    # do not sort: must match IML order
    srcs = [
        "gen",
        "src",
    ],
    iml_files = ["intellij.markdown.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/lang-impl:intellij.platform.lang.impl"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/markdown-utils:intellij.platform.markdown.utils[module]",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community:Guava",
        "//intellij-community:netty-codec-http",
        "//intellij-community/platform/built-in-server:intellij.platform.builtInServer.impl[module]",
        "//intellij-community:jcef",
        "//intellij-community:jsoup",
        "//intellij-community:netty-buffer",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community:jetbrains.markdown",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community:miglayout-swing",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:commons-codec",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
