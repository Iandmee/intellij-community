load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.rt",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations-java5",
        "//intellij-community:JUnit4[test]",
    ],
)
