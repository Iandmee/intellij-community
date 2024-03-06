load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.helpers.tests",
    iml_files = ["intellij.python.helpers.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/python:intellij.python.helpers[module, test]",
        "//intellij-community:Ant[test]",
        "//intellij-community:org.codehaus.groovy_groovy[test]",
    ],
)
