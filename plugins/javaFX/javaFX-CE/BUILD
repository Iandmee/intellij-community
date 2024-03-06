load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.javaFX.community",
    exclude = ["testSrc/org/jetbrains/plugins/javaFX/fxml/JavaFxGenerateDefaultPropertyValuesScript.java"],
    iml_files = ["intellij.javaFX.community.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/javaFX:intellij.javaFX"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/javaFX:intellij.javaFX[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/xml/impl:intellij.xml.impl[module, test]",
        "//intellij-community/plugins/groovy:intellij.groovy[module, test]",
        "//intellij-community/plugins/javaFX/common-javaFX-plugin:intellij.javaFX.common[module, test]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/plugins/groovy/structuralsearch-groovy:intellij.groovy.structuralSearch[module, test]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/plugins/javaFX:intellij.javaFX.properties[module, test]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module, test]",
    ],
)
