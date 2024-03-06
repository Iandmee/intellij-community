load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.lvcs.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.lvcs.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/platform/lvcs-api:intellij.platform.lvcs[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util/text-matching:intellij.platform.util.text.matching[module]",
    ],
)
