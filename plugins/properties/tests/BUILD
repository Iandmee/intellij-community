load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.properties.tests",
    iml_files = ["intellij.properties.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/properties:intellij.properties"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module, test]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module, test]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module, test]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/spellchecker:intellij.spellchecker[module, test]",
        "//intellij-community/xml/impl:intellij.xml.impl[module, test]",
        "//intellij-community/plugins/properties:intellij.properties[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/platform/platform-tests:intellij.platform.tests[module, test]",
        "//intellij-community/platform/boot:intellij.platform.boot[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module, test]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/structuralsearch:intellij.platform.structuralSearch.tests[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
