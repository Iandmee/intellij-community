load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.impl",
    srcs = ["src"],
    iml_files = ["intellij.xml.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/xml/openapi:intellij.xml",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl",
        "//intellij-community/xml/xml-analysis-impl:intellij.xml.analysis.impl",
        "//intellij-community/xml/xml-structure-view-impl:intellij.xml.structureView.impl",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community:Xerces",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/icons:intellij.platform.icons[module]",
        "//intellij-community/platform/platform-resources:intellij.platform.resources[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/xml/xml-analysis-impl:intellij.xml.analysis.impl[module]",
        "//intellij-community:swingx",
        "//intellij-community/xml/xml-structure-view-impl:intellij.xml.structureView.impl[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community/platform/webSymbols:intellij.platform.webSymbols[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community:aalto-xml",
    ],
)
