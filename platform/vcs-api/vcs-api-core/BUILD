load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.vcs.core",
    srcs = ["src"],
    iml_files = ["intellij.platform.vcs.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community:kotlin-stdlib",
    ],
)
