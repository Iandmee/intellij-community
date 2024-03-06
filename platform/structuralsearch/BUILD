load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.structuralSearch",
    srcs = ["source"],
    iml_files = ["intellij.platform.structuralSearch.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/duplicates-analysis:intellij.platform.duplicates.analysis"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/duplicates-analysis:intellij.platform.duplicates.analysis[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:fastutil-min",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.structuralSearch.tests",
    iml_files = ["intellij.platform.structuralSearch.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSource"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/structuralsearch:intellij.platform.structuralSearch[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/java/structuralsearch-java:intellij.java.structuralSearch[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
