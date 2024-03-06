load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.packageSearch.gradle",
    srcs = ["src"],
    iml_files = ["intellij.packageSearch.gradle.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community/plugins/gradle:intellij.gradle.common[module]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/plugins/package-search:intellij.packageSearch[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/external-system-api/dependency-updater:intellij.platform.externalSystem.dependencyUpdater[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/plugins/package-search/gradle/tooling:intellij.packageSearch.gradle.tooling[module]",
        "//intellij-community:kotlinx-serialization-protobuf",
    ],
)
