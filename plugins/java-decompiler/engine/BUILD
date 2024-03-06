load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.decompiler.engine",
    srcs = ["src"],
    iml_files = ["intellij.java.decompiler.engine.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit4[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:jetbrains-annotations",
    ],
)
