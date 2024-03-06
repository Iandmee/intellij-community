load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.base",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.base.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-coroutines-debug",
    ],
)
