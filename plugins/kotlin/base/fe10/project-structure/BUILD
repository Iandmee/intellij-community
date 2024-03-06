load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.fe10.project-structure",
    srcs = ["src"],
    iml_files = ["kotlin.base.fe10.project-structure.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
    ],
)
