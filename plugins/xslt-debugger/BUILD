load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xslt.debugger",
    srcs = ["src"],
    iml_files = ["intellij.xslt.debugger.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/xpath:intellij.xpath[module]",
        "//intellij-community/plugins/xslt-debugger/engine:intellij.xslt.debugger.rt[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
    ],
)
