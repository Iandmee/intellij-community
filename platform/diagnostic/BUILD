load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.diagnostic",
    srcs = ["src"],
    iml_files = ["intellij.platform.diagnostic.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    package_prefixes = {"src": "com.intellij.diagnostic"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:fastutil-min",
    ],
)
