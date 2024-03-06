load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.psi.impl",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.xml.psi.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi",
        "//intellij-community/RegExpSupport:intellij.regexp",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/indexing-impl:intellij.platform.indexing.impl[module]",
        "//intellij-community:Xerces",
        "//intellij-community/RegExpSupport:intellij.regexp[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:xml-resolver",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:caffeine",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/webSymbols:intellij.platform.webSymbols[module]",
    ],
)
