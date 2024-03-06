load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.images.copyright",
    srcs = ["src"],
    iml_files = ["intellij.platform.images.copyright.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/images:intellij.platform.images[module]",
        "//intellij-community/plugins/copyright:intellij.copyright[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
    ],
)
