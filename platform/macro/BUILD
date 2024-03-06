load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.macro",
    srcs = ["src"],
    iml_files = ["intellij.platform.macro.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/execution:intellij.platform.execution[module]",
        "//intellij-community/platform/lang-core:intellij.platform.lang.core[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/ide-core:intellij.platform.ide.core[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
