load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml",
    srcs = ["src"],
    iml_files = ["intellij.xml.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi",
        "//intellij-community/xml/xml-analysis-api:intellij.xml.analysis",
        "//intellij-community/xml/xml-structure-view-api:intellij.xml.structureView",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/xml/xml-analysis-api:intellij.xml.analysis[module]",
        "//intellij-community/xml/xml-structure-view-api:intellij.xml.structureView[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
    ],
)
