load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.evaluationPlugin.core",
    srcs = ["src"],
    iml_files = ["intellij.evaluationPlugin.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:gson",
        "//intellij-community:commons-codec",
        "//intellij-community:commons-compress",
        "//intellij-community:kotlinx-html-jvm",
        "//intellij-community:commons-lang3",
        "//intellij-community:commons-text",
    ],
)
