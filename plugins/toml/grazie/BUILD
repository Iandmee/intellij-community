load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.toml.grazie",
    srcs = ["src/main/kotlin"],
    iml_files = ["intellij.toml.grazie.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/toml/core:intellij.toml.core[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/grazie/src:intellij.grazie.core[module]",
    ],
)
