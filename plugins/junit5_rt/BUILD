load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.junit.v5.rt",
    srcs = ["src"],
    iml_files = ["intellij.junit.v5.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/junit_rt:intellij.junit.rt[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community:JUnit5Launcher",
        "//intellij-community:JUnit5",
    ],
)
