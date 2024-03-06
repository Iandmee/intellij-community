load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.evaluationPlugin.languages",
    srcs = ["src"],
    iml_files = ["intellij.evaluationPlugin.languages.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:commons-io",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/evaluation-plugin/core:intellij.evaluationPlugin.core[module]",
    ],
)
