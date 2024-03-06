load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.rt.classLoader",
    srcs = ["src"],
    iml_files = ["intellij.groovy.rt.classLoader.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations-java5",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
    ],
)
