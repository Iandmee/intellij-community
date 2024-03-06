load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.elevation.common",
    # do not sort: must match IML order
    srcs = [
        "gen",
        "src",
    ],
    iml_files = ["intellij.platform.elevation.common.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
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
        "//intellij-community:grpc-kotlin-stub",
        "//intellij-community:javax.annotation-api",
        "//intellij-community:JUnit5[test]",
        "//m2:com.willowtreeapps.assertk_assertk-jvm[test]",
    ],
)
