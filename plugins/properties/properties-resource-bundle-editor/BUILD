load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.properties.resource.bundle.editor",
    srcs = ["src"],
    iml_files = ["intellij.properties.resource.bundle.editor.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community/plugins/properties:intellij.properties[module]",
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
