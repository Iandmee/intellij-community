load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.reproducibleBuilds.diffTool",
    srcs = ["src"],
    iml_files = ["intellij.platform.reproducibleBuilds.diffTool.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:gson",
    ],
)
