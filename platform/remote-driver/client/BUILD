load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.driver.client",
    srcs = ["src"],
    iml_files = ["intellij.driver.client.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/remote-driver/model:intellij.driver.model"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/remote-driver/model:intellij.driver.model[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains-annotations",
    ],
)
