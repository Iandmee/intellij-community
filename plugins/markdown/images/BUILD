load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown.images",
    srcs = ["src/main/kotlin"],
    iml_files = ["intellij.markdown.images.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/markdown/core:intellij.markdown.core[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/images:intellij.platform.images[module]",
        "//intellij-community/platform/localIde:intellij.platform.localIde[module]",
    ],
)
