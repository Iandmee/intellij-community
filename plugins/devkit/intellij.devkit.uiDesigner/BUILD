load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.uiDesigner",
    srcs = ["src"],
    iml_files = ["intellij.devkit.uiDesigner.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.idea.devkit.uiDesigner"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/plugins/ui-designer:intellij.java.guiForms.designer[module]",
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util/text-matching:intellij.platform.util.text.matching[module]",
    ],
)
