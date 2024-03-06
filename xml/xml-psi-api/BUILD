load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.psi",
    srcs = ["src"],
    iml_files = ["intellij.xml.psi.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/xml/xml-frontback:intellij.xml.frontback"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/xml-frontback:intellij.xml.frontback[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
    ],
)
