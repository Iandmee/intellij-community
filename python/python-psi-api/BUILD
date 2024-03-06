load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.psi",
    srcs = ["src"],
    iml_files = ["intellij.python.psi.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/python/python-parser:intellij.python.parser"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:Guava",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/python/python-parser:intellij.python.parser[module]",
    ],
)
