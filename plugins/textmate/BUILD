load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.textmate",
    srcs = ["src"],
    iml_files = ["intellij.textmate.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/textmate/core:intellij.textmate.core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community/plugins/textmate/core:intellij.textmate.core[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:kotlinx-serialization-core",
    ],
)
