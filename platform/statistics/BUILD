load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.statistics",
    srcs = ["src"],
    iml_files = ["intellij.platform.statistics.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:ap-validation"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/statistics/uploader:intellij.platform.statistics.uploader[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:jna",
        "//intellij-community:ap-validation",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community:caffeine",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/ide-core:intellij.platform.ide.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:kotlin-reflect",
        "//intellij-community:kotlinx-coroutines-core",
    ],
)
