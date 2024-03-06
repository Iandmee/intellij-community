load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.junit",
    srcs = ["src"],
    iml_files = ["intellij.junit.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/smRunner:intellij.platform.smRunner"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner[module]",
        "//intellij-community:JUnit4",
        "//intellij-community/plugins/junit_rt:intellij.junit.rt[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/jvm/jvm-analysis-api:intellij.jvm.analysis[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module, test]",
    ],
)
