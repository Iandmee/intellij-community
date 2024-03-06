load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.model",
    srcs = ["src"],
    iml_files = ["intellij.platform.jps.model.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:jetbrains-annotations"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:jetbrains-annotations",
    ],
)
