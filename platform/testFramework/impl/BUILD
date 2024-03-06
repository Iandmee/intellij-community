load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.testFramework.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.testFramework.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community:ASM",
    ],
)
