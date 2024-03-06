load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.indexing",
    srcs = ["src"],
    iml_files = ["intellij.java.indexing.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
    ],
)
