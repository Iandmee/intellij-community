load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.boot",
    srcs = ["src"],
    iml_files = ["intellij.platform.boot.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module]",
    ],
)
