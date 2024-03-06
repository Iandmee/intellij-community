load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown.spellchecker",
    srcs = ["src/main/kotlin"],
    iml_files = ["intellij.markdown.spellchecker.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/markdown/core:intellij.markdown.core[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/platform/localIde:intellij.platform.localIde[module]",
    ],
)
