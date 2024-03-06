load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.ide.core",
    srcs = ["src"],
    iml_files = ["intellij.platform.ide.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
