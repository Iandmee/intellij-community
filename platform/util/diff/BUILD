load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.diff",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.diff.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util/base:intellij.platform.util.base[module]",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:fastutil-min",
    ],
)
