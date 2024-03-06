load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.vcs.log",
    srcs = ["src"],
    iml_files = ["intellij.platform.vcs.log.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/vcs-log/graph-api:intellij.platform.vcs.log.graph"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community/platform/vcs-log/graph-api:intellij.platform.vcs.log.graph[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/vcs-api/vcs-api-core:intellij.platform.vcs.core[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
