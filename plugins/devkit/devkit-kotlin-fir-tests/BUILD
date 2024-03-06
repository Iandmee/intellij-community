load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.kotlin.fir.tests",
    iml_files = ["intellij.devkit.kotlin.fir.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/code-insight/kotlin.code-insight.k2[module]",
        "//intellij-community/plugins/devkit/intellij.devkit[module]",
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core[module]",
        "//intellij-community/plugins/devkit/devkit-tests:intellij.devkit.testFramework[module]",
        "//intellij-community/plugins/kotlin:intellij.kotlin.plugin.community.main[module]",
        "//intellij-community/plugins/devkit/intellij.kotlin.devkit[module]",
    ],
)
