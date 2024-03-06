load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.elevation",
    srcs = ["src"],
    iml_files = ["intellij.platform.elevation.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:grpc-core",
        "//intellij-community/platform/elevation/client:intellij.platform.elevation.client[module]",
        "//intellij-community/platform/elevation/daemon:intellij.platform.elevation.daemon[module]",
        "//intellij-community/platform/elevation/common:intellij.platform.elevation.common[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:jna",
    ],
)
