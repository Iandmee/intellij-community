load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jsp",
    srcs = ["src"],
    iml_files = ["intellij.jsp.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/java/jsp-base-openapi:intellij.jsp.base"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/java/jsp-base-openapi:intellij.jsp.base[module]",
    ],
)
