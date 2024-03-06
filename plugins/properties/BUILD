load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.properties",
    srcs = ["src"],
    iml_files = ["intellij.properties.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/plugins/properties/properties-psi-api:intellij.properties.psi[module]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/structuralsearch:intellij.platform.structuralSearch[module]",
    ],
)
