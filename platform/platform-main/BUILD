load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.main",
    srcs = ["src"],
    iml_files = ["intellij.platform.main.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/bootstrap:intellij.platform.bootstrap[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlin-stdlib",
    ],
)
