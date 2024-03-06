load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.debugger",
    srcs = ["src"],
    iml_files = ["intellij.java.debugger.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/xdebugger-api:intellij.platform.debugger"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/java/jsp-openapi:intellij.jsp[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/resources-en:intellij.java.resources.en[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
    ],
)
