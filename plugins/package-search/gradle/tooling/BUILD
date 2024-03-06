load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.packageSearch.gradle.tooling",
    srcs = ["src"],
    iml_files = ["intellij.packageSearch.gradle.tooling.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension[module]",
    ],
)
