load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.inspect",
    srcs = ["src"],
    iml_files = ["intellij.platform.inspect.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community/platform/extensions:intellij.platform.extensions",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/vcs-api/vcs-api-core:intellij.platform.vcs.core[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module]",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community:cli-parser",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:snakeyaml",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jackson-databind",
        "//intellij-community:jsoup",
        "//intellij-community:jackson",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
