load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.javaFX",
    srcs = ["src"],
    iml_files = ["intellij.javaFX.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/javaFX/common-javaFX-plugin:intellij.javaFX.common"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/java/compiler/impl:intellij.java.compiler.impl[module]",
        "//intellij-community/plugins/javaFX/common-javaFX-plugin:intellij.javaFX.common[module]",
        "//intellij-community/java/manifest:intellij.java.manifest[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/plugins/properties:intellij.properties[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/typeMigration:intellij.java.typeMigration[module]",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.javaFX.properties",
    srcs = ["properties/src"],
    iml_files = ["intellij.javaFX.properties.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["properties/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community/plugins/javaFX:intellij.javaFX[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community:StreamEx",
    ],
)
