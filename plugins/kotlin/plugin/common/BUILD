load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.plugin.common",
    iml_files = ["kotlin.plugin.common.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/platform/util/trove:intellij.platform.util.trove",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
    ],
)
