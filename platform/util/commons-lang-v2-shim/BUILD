load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.commonsLangV2Shim",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.commonsLangV2Shim.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:commons-lang3",
        "//m2:commons-collections",
    ],
)
