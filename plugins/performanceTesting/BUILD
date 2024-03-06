load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.performanceTesting",
    # do not sort: must match IML order
    srcs = [
        "gen",
        "src",
    ],
    iml_files = ["intellij.performanceTesting.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:cli-parser",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:jackson",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:jackson-databind",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//m2:github.oshi.core",
        "//intellij-community:opentelemetry",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community/platform/vcs-log/impl:intellij.platform.vcs.log.impl[module]",
        "//intellij-community/platform/vcs-log/api:intellij.platform.vcs.log[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community:caffeine",
        "//intellij-community/platform/remote-driver/core:intellij.driver.impl[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community:netty-buffer",
        "//intellij-community/platform/diagnostic/startUpPerformanceReporter:intellij.platform.diagnostic.startUpPerformanceReporter[module]",
    ],
)
