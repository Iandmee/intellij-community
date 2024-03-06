load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.uast.ide",
    srcs = ["src"],
    iml_files = ["intellij.java.uast.ide.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/uast/uast-java:intellij.java.uast"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/uast/uast-java:intellij.java.uast[module]",
    ],
)
