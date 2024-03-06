load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.dom.tests",
    iml_files = ["intellij.xml.dom.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/dom-impl:intellij.xml.dom.impl[module]",
        "//intellij-community:CGLIB",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
