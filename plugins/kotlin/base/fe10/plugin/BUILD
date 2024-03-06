load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.fe10.plugin",
    srcs = ["src"],
    iml_files = ["kotlin.base.fe10.plugin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
    ],
)
