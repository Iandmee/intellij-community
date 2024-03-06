load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tasks",
    srcs = ["src"],
    iml_files = ["intellij.tasks.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/tasks-platform-api:intellij.platform.tasks"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/tasks-platform-api:intellij.platform.tasks[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
