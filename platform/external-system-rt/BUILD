load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.externalSystem.rt",
    srcs = ["src"],
    iml_files = ["intellij.platform.externalSystem.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations-java5",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer.annotations[module]",
    ],
)
