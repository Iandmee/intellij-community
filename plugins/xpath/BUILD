load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xpath",
    # do not sort: must match IML order
    srcs = [
        "xpath-lang/src",
        "xpath-view/src",
        "xpath-lang/gen",
    ],
    iml_files = ["intellij.xpath.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    # do not sort: must match IML order
    resources = [
        "xpath-lang/resources",
        "xpath-lang/compatibilityResources",
    ],
    test_resources = ["xpath-lang/testData"],
    test_srcs = ["xpath-lang/test"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/xml/dom-impl:intellij.xml.dom.impl"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/plugins/xpath/xslt-rt:intellij.xpath.rt[module]",
        "//intellij-community:Jaxen",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
