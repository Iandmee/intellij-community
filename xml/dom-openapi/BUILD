load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.dom",
    srcs = ["src"],
    iml_files = ["intellij.xml.dom.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/platform-resources:intellij.platform.resources[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
