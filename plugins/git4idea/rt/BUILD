load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.vcs.git.rt",
    srcs = ["src"],
    iml_files = ["intellij.vcs.git.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/external-process-auth-helper/rt:intellij.platform.externalProcessAuthHelper.rt[module]",
    ],
)
