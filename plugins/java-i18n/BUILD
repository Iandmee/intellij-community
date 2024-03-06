load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.i18n",
    srcs = ["src"],
    iml_files = ["intellij.java.i18n.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/plugins/properties:intellij.properties",
        "//intellij-community/java/java-impl:intellij.java.impl",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/plugins/properties:intellij.properties[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/jsp-base-openapi:intellij.jsp.base[module]",
        "//intellij-community/java/jsp-openapi:intellij.jsp[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/plugins/properties/properties-psi-api:intellij.properties.psi[module]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community/jvm/jvm-analysis-api:intellij.jvm.analysis[module]",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:icu4j",
        "//intellij-community:fastutil-min",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
