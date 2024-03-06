load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jsp.spi",
    srcs = ["src"],
    iml_files = ["intellij.jsp.spi.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/java/jsp-openapi:intellij.jsp",
        "//intellij-community/java/openapi:intellij.java",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/jsp-openapi:intellij.jsp[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/jsp-base-openapi:intellij.jsp.base[module]",
    ],
)
