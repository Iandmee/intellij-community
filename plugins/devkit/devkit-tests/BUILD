load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.testFramework",
    iml_files = ["intellij.devkit.testFramework.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_friends = ["//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core",
        "//intellij-community/java/testFramework:intellij.java.testFramework",
        "//intellij-community:assertJ",
        "//intellij-community/platform/util:intellij.platform.util",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework",
        "//intellij-community/xml/dom-tests:intellij.xml.dom.tests",
        "//intellij-community/java/compiler:intellij.java.compiler.tests",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom",
        "//intellij-community/xml/dom-impl:intellij.xml.dom.impl",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler",
        "//intellij-community/jvm/jvm-analysis-api:intellij.jvm.analysis",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community/xml/dom-tests:intellij.xml.dom.tests[module]",
        "//intellij-community/java/compiler:intellij.java.compiler.tests[module]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community/xml/dom-impl:intellij.xml.dom.impl[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/jvm/jvm-analysis-api:intellij.jvm.analysis[module]",
    ],
)
