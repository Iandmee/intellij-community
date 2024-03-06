load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.tests",
    iml_files = ["intellij.xml.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["src"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/IntelliLang:intellij.xml.langInjection"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit4[test]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community:Xerces",
        "//intellij-community/java/idea-ui:intellij.java.ui[module, test]",
        "//intellij-community/java/java-impl:intellij.java.impl[module, test]",
        "//intellij-community/plugins/ant:intellij.ant[module, test]",
        "//intellij-community/plugins/xpath:intellij.xpath[module, test]",
        "//intellij-community/xml/dom-impl:intellij.xml.dom.impl[module, test]",
        "//intellij-community/platform/platform-tests:intellij.platform.tests[module, test]",
        "//intellij-community:xml-resolver[test]",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community/plugins/IntelliLang:intellij.platform.langInjection[module, test]",
        "//intellij-community/plugins/IntelliLang:intellij.java.langInjection[module]",
        "//intellij-community/xml/xml-analysis-impl:intellij.xml.analysis.impl[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:Guava[test]",
        "//intellij-community:jackson[test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
