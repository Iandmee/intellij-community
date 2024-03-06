load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.html.tools.tests",
    iml_files = ["intellij.html.tools.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/htmltools:intellij.html.tools[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/spellchecker:intellij.spellchecker[module, test]",
        "//intellij-community/xml/tests:intellij.xml.tests[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
