load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.structureView",
    srcs = ["src"],
    iml_files = ["intellij.xml.structureView.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/xml/xml-psi-api:intellij.xml.psi"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
    ],
)
