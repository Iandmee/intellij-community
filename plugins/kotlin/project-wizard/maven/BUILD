load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.project-wizard.maven",
    srcs = ["src"],
    iml_files = ["kotlin.project-wizard.maven.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/project-wizard/core:kotlin.project-wizard.core[module]",
        "//intellij-community/plugins/kotlin/project-wizard/idea:kotlin.project-wizard.idea[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/plugins/maven:intellij.maven[module]",
    ],
)
