load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.elevation.client",
    srcs = ["src"],
    iml_files = ["intellij.platform.elevation.client.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:Guava",
        "//intellij-community:protobuf",
        "//intellij-community:grpc-core",
        "//intellij-community:grpc-stub",
        "//intellij-community:grpc-protobuf",
        "//intellij-community:grpc-kotlin-stub",
        "//intellij-community/platform/elevation/daemon:intellij.platform.elevation.daemon[module]",
        "//intellij-community/platform/elevation/common:intellij.platform.elevation.common[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community:jetbrains-annotations[test]",
        "//m2:grpc-inprocess",
    ],
)
