load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.uast.ide",
    srcs = ["src"],
    iml_files = ["intellij.platform.uast.ide.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:StreamEx",
    ],
)
