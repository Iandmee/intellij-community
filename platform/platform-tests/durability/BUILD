load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.durability",
    iml_files = ["intellij.platform.durability.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:ktor-network-tls[test]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:kotlinx-serialization-core[test]",
        "//intellij-community:kotlinx-serialization-json[test]",
        "//intellij-community:kotlinc.kotlinx-serialization-compiler-plugin[test]",
        "//intellij-community:kotlin-reflect[test]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)
