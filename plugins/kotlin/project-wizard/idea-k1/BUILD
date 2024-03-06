load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.project-wizard.idea-k1",
    srcs = ["src"],
    iml_files = ["kotlin.project-wizard.idea-k1.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/project-wizard/core:kotlin.project-wizard.core[module]",
        "//intellij-community/plugins/kotlin/project-wizard/idea:kotlin.project-wizard.idea[module]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module]",
        "//intellij-community/plugins/kotlin/code-insight/api:kotlin.code-insight.api[module]",
    ],
)
