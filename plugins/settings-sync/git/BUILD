load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.settingsSync.git",
    srcs = ["src"],
    iml_files = ["intellij.settingsSync.git.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/settings-sync:intellij.settingsSync[module]",
        "//intellij-community/platform/ide-core:intellij.platform.ide.core[module]",
        "//intellij-community/plugins/git4idea:intellij.vcs.git[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
    ],
)
