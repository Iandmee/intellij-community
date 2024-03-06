load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.images",
    srcs = ["src"],
    iml_files = ["intellij.devkit.images.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.idea.devkit.images"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/images:intellij.platform.images[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
    ],
)
