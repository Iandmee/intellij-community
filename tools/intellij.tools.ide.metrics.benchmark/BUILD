load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tools.ide.metrics.benchmark",
    srcs = ["src"],
    iml_files = ["intellij.tools.ide.metrics.benchmark.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_resources = ["testResources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community/tools/intellij.tools.ide.metrics.collector[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
    ],
)
