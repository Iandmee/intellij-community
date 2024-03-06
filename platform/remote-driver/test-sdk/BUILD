load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.driver.sdk",
    srcs = ["src"],
    iml_files = ["intellij.driver.sdk.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/remote-driver/client:intellij.driver.client",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/remote-driver/client:intellij.driver.client[module]",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
    ],
)
