load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.uast.tests",
    iml_files = ["intellij.groovy.uast.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module, test]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module, test]",
        "//intellij-community/plugins/groovy/groovy-psi:intellij.groovy.psi[module, test]",
        "//intellij-community/uast/testFramework:intellij.platform.uast.testFramework[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
    ],
)
