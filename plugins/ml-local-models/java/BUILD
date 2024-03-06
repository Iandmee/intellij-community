load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.ml.models.local.java",
    srcs = ["src"],
    iml_files = ["intellij.ml.models.local.java.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/plugins/ml-local-models:intellij.ml.models.local[module]",
    ],
)
