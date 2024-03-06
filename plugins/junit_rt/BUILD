load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.junit.rt",
    srcs = ["src"],
    iml_files = ["intellij.junit.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit4",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
    ],
)
