load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.diff.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.diff.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/diff-api:intellij.platform.diff"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community:Guava",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community:kotlinx-coroutines-core",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.diff.tests",
    iml_files = ["intellij.platform.diff.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["tests/testData"],
    test_srcs = ["tests/testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/diff-api:intellij.platform.diff"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/vcs-api/vcs-api-core:intellij.platform.vcs.core[module]",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module, test]",
        "//intellij-community:mockito[test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module, test]",
        "//intellij-community/platform/platform-tests:intellij.platform.tests[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
