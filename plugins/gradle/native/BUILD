load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.native",
    srcs = ["src"],
    iml_files = ["intellij.gradle.native.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.plugins.gradle.nativeplatform"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/plugins/gradle:intellij.gradle.common",
        "//intellij-community/plugins/gradle/native/tooling:intellij.gradle.native.tooling",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/gradle:intellij.gradle[module]",
        "//intellij-community/plugins/gradle:intellij.gradle.common[module]",
        "//intellij-community/plugins/gradle/native/tooling:intellij.gradle.native.tooling[module]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
    ],
)
