load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.plugin.noKotlin",
    iml_files = ["intellij.devkit.plugin.noKotlin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/plugins/devkit/intellij.devkit",
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core",
        "//intellij-community/plugins/devkit/intellij.devkit.git",
        "//intellij-community/plugins/devkit/intellij.devkit.gradle",
        "//intellij-community/plugins/devkit/intellij.devkit.i18n",
        "//intellij-community/plugins/devkit/intellij.devkit.images",
        "//intellij-community/plugins/devkit/intellij.devkit.intelliLang",
        "//intellij-community/plugins/devkit/intellij.devkit.themes",
        "//intellij-community/plugins/devkit/intellij.devkit.uiDesigner",
        "//intellij-community/plugins/devkit/intellij.devkit.workspaceModel",
        "//intellij-community/plugins/devkit/jps-plugin:intellij.devkit.jps",
        "//intellij-community/plugins/devkit/runtimeModuleRepository/jps:intellij.devkit.runtimeModuleRepository.jps",
    ],
    deps = ["//intellij-community/plugins/devkit/devkit-java-tests:intellij.devkit.java.tests[module, test]"],
)
