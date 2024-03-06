load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.elevation.daemon",
    srcs = ["src"],
    iml_files = ["intellij.platform.elevation.daemon.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:Guava",
        "//intellij-community:protobuf",
        "//intellij-community:grpc-core",
        "//intellij-community:grpc-stub",
        "//intellij-community:grpc-protobuf",
        "//intellij-community:grpc-netty-shaded",
        "//intellij-community:grpc-kotlin-stub",
        "//intellij-community:jna",
        "//intellij-community/platform/elevation/common:intellij.platform.elevation.common[module]",
    ],
)
