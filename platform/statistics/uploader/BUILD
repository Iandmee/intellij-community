load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.statistics.uploader",
    srcs = ["src"],
    iml_files = ["intellij.platform.statistics.uploader.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/statistics/config:intellij.platform.statistics.config"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/statistics/config:intellij.platform.statistics.config[module]",
        "//intellij-community:ap-validation",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
    ],
)
