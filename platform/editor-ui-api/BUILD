load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.editor",
    srcs = ["src"],
    iml_files = ["intellij.platform.editor.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
