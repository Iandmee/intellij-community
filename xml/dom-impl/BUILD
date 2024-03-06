load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xml.dom.impl",
    srcs = ["src"],
    iml_files = ["intellij.xml.dom.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/xml/dom-openapi:intellij.xml.dom"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community:CGLIB",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/platform-resources:intellij.platform.resources[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
