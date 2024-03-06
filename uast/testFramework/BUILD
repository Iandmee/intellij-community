load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.uast.testFramework",
    srcs = ["src"],
    iml_files = ["intellij.platform.uast.testFramework.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/uast/uast-common:intellij.platform.uast"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
    ],
)
