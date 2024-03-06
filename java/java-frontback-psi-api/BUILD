load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.frontback.psi",
    srcs = ["src"],
    iml_files = ["intellij.java.frontback.psi.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/core-api:intellij.platform.core"],
    deps = ["//intellij-community/platform/core-api:intellij.platform.core[module]"],
)
