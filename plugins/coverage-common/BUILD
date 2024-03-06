load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.coverage",
    srcs = ["src"],
    iml_files = ["intellij.platform.coverage.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:ASM",
        "//intellij-community:intellij-coverage",
        "//intellij-community:intellij-test-discovery",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community:ASM",
        "//intellij-community:intellij-coverage",
        "//intellij-community:intellij-test-discovery",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/lvcs-api:intellij.platform.lvcs[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
