load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.terminal",
    srcs = ["src"],
    iml_files = ["intellij.terminal.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_resources = ["testResources"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community:pty4j",
        "//intellij-community:jna",
        "//intellij-community/platform/remote-servers/api:intellij.platform.remoteServers[module]",
        "//intellij-community/platform/remote-servers/impl:intellij.platform.remoteServers.impl[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:jediterm-core",
        "//intellij-community:jediterm-ui",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.tests[module, test]",
        "//intellij-community:winp",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/plugins/terminal/completion:intellij.terminal.completion[module]",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community:caffeine",
        "//m2:terminal-completion-db-with-extensions",
    ],
)
