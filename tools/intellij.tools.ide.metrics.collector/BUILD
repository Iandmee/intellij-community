load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tools.ide.metrics.collector",
    srcs = ["src"],
    iml_files = ["intellij.tools.ide.metrics.collector.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["testResources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:kotlin-test-assertions-core-jvm[test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community:mockito[test]",
        "//intellij-community:mockito-junit-jupiter[test]",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community/tools/intellij.tools.ide.util.common[module]",
    ],
)
