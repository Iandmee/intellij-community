load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.progress",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.progress.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    package_prefixes = {"src": "com.intellij.platform.util.progress"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:Guava",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)
