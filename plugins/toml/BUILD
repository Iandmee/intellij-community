load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.toml",
    iml_files = ["intellij.toml.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/plugins/toml/core:intellij.toml.core",
        "//intellij-community/plugins/toml/json:intellij.toml.json",
        "//intellij-community/plugins/toml/grazie:intellij.toml.grazie",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/toml/core:intellij.toml.core[module]",
        "//intellij-community/plugins/toml/json:intellij.toml.json[module]",
        "//intellij-community/plugins/toml/grazie:intellij.toml.grazie[module]",
    ],
)
