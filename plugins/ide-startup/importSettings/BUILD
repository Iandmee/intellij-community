load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.ide.startup.importSettings",
    srcs = ["src"],
    iml_files = ["intellij.ide.startup.importSettings.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:rd-core",
        "//intellij-community:rd-swing",
        "//intellij-community/platform/rd-platform-community:intellij.platform.rd.community[module]",
        "//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.impl[module]",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module]",
        "//intellij-community/platform/code-style-api:intellij.platform.codeStyle[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
    ],
)
