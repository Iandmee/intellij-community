load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.dependencyUpdater",
    srcs = ["src"],
    iml_files = ["intellij.gradle.dependencyUpdater.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/android/gradle-dsl-kotlin:intellij.android.gradle.dsl.kotlin",
        "//intellij-community/android/gradle-dsl-toml:intellij.android.gradle.dsl.toml",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/gradle:intellij.gradle[module]",
        "//intellij-community/plugins/gradle:intellij.gradle.common[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/external-system-api/dependency-updater:intellij.platform.externalSystem.dependencyUpdater[module]",
        "//intellij-community/android/gradle-dsl:intellij.android.gradle.dsl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
