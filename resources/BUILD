load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.resources",
    iml_files = ["intellij.java.resources.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/RegExpSupport:intellij.regexp"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-resources:intellij.platform.resources[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/platform-resources-en:intellij.platform.resources.en[module]",
    ],
)
