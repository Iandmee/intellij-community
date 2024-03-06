load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.dev",
    srcs = ["src"],
    iml_files = ["intellij.java.dev.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij.java.dev"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/plugins/dev/intellij.dev.psiViewer[module]",
        "//intellij-community/plugins/dev/intellij.dev.codeInsight[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl[module]",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
    ],
)
