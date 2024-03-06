load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.grazie",
    iml_files = ["intellij.grazie.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/grazie/src:intellij.grazie.core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/grazie/src:intellij.grazie.core[module]",
        "//intellij-community/plugins/grazie/java:intellij.grazie.java[module]",
        "//intellij-community/plugins/grazie/json:intellij.grazie.json[module]",
        "//intellij-community/plugins/grazie/markdown:intellij.grazie.markdown[module]",
        "//intellij-community/plugins/grazie/properties:intellij.grazie.properties[module]",
        "//intellij-community/plugins/grazie/xml:intellij.grazie.xml[module]",
        "//intellij-community/plugins/grazie/yaml:intellij.grazie.yaml[module]",
    ],
)
