load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.structureView.impl",
    srcs = ["src"],
    iml_files = ["intellij.xml.structureView.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/xml-structure-view-api:intellij.xml.structureView[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/platform/structure-view-impl:intellij.platform.structureView.impl[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
    ],
)
