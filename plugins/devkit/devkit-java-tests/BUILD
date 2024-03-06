load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.java.tests",
    iml_files = ["intellij.devkit.java.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["testData"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/devkit/intellij.devkit"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module, test]",
        "//intellij-community/spellchecker:intellij.spellchecker[module, test]",
        "//intellij-community/xml/xml-analysis-impl:intellij.xml.analysis.impl[module, test]",
        "//intellij-community/plugins/devkit/devkit-tests:intellij.devkit.testFramework[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/plugins/properties:intellij.properties[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community:CGLIB",
        "//intellij-community/plugins/devkit/intellij.devkit.themes[module, test]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module, test]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
