load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.debugger.streams",
    srcs = ["src"],
    iml_files = ["intellij.java.debugger.streams.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:StreamEx",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
    ],
)
