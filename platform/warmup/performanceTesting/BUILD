load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.warmup.performanceTesting",
    srcs = ["src"],
    iml_files = ["intellij.platform.warmup.performanceTesting.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/warmup:intellij.platform.warmup[module]",
        "//intellij-community/plugins/performanceTesting:intellij.performanceTesting[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/remote-driver/model:intellij.driver.model[module]",
        "//intellij-community/plugins/performanceTesting/commands-model:intellij.tools.ide.performanceTesting.commands[module]",
        "//intellij-community/platform/vcs-log/impl:intellij.platform.vcs.log.impl[module]",
        "//intellij-community/platform/vcs-log/api:intellij.platform.vcs.log[module]",
    ],
)
