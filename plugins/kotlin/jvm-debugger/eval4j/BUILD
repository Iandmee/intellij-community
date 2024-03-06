load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.jvm-debugger.eval4j",
    srcs = ["src"],
    iml_files = ["kotlin.jvm-debugger.eval4j.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/platform/core-api:intellij.platform.core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:ASM",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)
