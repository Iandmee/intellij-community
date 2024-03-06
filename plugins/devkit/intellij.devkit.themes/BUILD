load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.themes",
    srcs = ["src"],
    iml_files = ["intellij.devkit.themes.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {
        "test": "org.jetbrains.idea.devkit.themes",
        "src": "org.jetbrains.idea.devkit.themes",
    },
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/json:intellij.json[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core[module]",
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
