load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.analysis.impl",
    srcs = ["src"],
    iml_files = ["intellij.xml.analysis.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/xml/xml-analysis-api:intellij.xml.analysis"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/xml/xml-analysis-api:intellij.xml.analysis[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/editor-ui-ex:intellij.platform.editor.ex[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
    ],
)
