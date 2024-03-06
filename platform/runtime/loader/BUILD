load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.runtime.loader",
    srcs = ["src"],
    iml_files = ["intellij.platform.runtime.loader.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/runtime/repository:intellij.platform.runtime.repository[module]",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
    ],
)
