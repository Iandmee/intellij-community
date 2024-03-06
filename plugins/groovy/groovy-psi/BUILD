load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.psi",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.groovy.psi.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:org.codehaus.groovy_groovy"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community:Guava",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/plugins/junit:intellij.junit[module, test]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/platform/editor-ui-ex:intellij.platform.editor.ex[module]",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl[module]",
        "//intellij-community/java/java-structure-view:intellij.java.structureView[module]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community/plugins/properties/properties-psi-api:intellij.properties.psi[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:kotlin-reflect",
        "//intellij-community:fastutil-min",
        "//intellij-community:ASM",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
