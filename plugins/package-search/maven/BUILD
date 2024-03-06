load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.packageSearch.maven",
    srcs = ["src"],
    iml_files = ["intellij.packageSearch.maven.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/plugins/maven:intellij.maven[module]",
        "//intellij-community/plugins/package-search:intellij.packageSearch[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/external-system-api/dependency-updater:intellij.platform.externalSystem.dependencyUpdater[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community:kotlinx-serialization-core",
    ],
)
