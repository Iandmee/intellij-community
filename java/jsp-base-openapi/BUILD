load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jsp.base",
    srcs = ["src"],
    iml_files = ["intellij.jsp.base.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/xml/openapi:intellij.xml"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
    ],
)
