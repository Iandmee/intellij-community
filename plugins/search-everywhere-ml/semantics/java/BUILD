load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.searchEverywhereMl.semantics.java",
    srcs = ["src"],
    iml_files = ["intellij.searchEverywhereMl.semantics.java.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/search-everywhere-ml/semantics:intellij.searchEverywhereMl.semantics[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/ml-embeddings:intellij.platform.ml.embeddings[module]",
    ],
)
