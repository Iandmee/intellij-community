load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.ide.util.netty",
    srcs = ["src"],
    iml_files = ["intellij.platform.ide.util.netty.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community:Guava",
        "//intellij-community:fastutil-min",
        "//intellij-community:netty-buffer",
        "//intellij-community:netty-codec-http",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:kotlinx-coroutines-core",
    ],
)
