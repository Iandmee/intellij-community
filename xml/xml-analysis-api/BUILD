load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.analysis",
    srcs = ["src"],
    iml_files = ["intellij.xml.analysis.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis",
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community/platform/extensions:intellij.platform.extensions",
        "//intellij-community/platform/util:intellij.platform.util",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)
