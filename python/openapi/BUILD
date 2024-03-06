load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community",
    srcs = ["src"],
    iml_files = ["intellij.python.community.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/python/python-psi-api:intellij.python.psi",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:jsoup",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
    ],
)
