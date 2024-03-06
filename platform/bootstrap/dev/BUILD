load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.bootstrap.dev",
    srcs = ["src"],
    iml_files = ["intellij.platform.bootstrap.dev.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/bootstrap:intellij.platform.bootstrap[module]",
        "//intellij-community/platform/build-scripts/dev-server:intellij.platform.devBuildServer[module]",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
    ],
)
