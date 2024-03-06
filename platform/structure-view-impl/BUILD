load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.structureView.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.structureView.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor",
        "//intellij-community/platform/util:intellij.platform.util",
        "//intellij-community/platform/extensions:intellij.platform.extensions",
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community/platform/platform-resources-en:intellij.platform.resources.en",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-resources-en:intellij.platform.resources.en[module]",
        "//intellij-community/platform/icons:intellij.platform.icons[module]",
        "//intellij-community:automaton",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
