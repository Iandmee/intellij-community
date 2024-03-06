load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.testng",
    srcs = ["src"],
    iml_files = ["intellij.testng.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    # do not sort: must match IML order
    resources = [
        "resources",
        "compatibilityResources",
    ],
    test_srcs = ["testSources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/smRunner:intellij.platform.smRunner"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module]",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl[module]",
        "//intellij-community/java/debugger/openapi:intellij.java.debugger[module]",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community/plugins/testng_rt:intellij.testng.rt[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/jsp-openapi:intellij.jsp[module]",
        "//intellij-community:TestNG",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module, test]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module]",
        "//intellij-community/java/typeMigration:intellij.java.typeMigration[module]",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
