load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.core.ui",
    srcs = ["src"],
    iml_files = ["intellij.platform.core.ui.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:hash4j",
    ],
)
