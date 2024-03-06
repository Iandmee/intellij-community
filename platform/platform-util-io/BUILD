load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.ide.util.io",
    srcs = ["src"],
    iml_files = ["intellij.platform.ide.util.io.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community:Guava",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/base:intellij.platform.util.base[module]",
        "//intellij-community:jna",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
