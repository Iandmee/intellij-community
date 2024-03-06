load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.plugin",
    iml_files = ["intellij.java.plugin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/java/compiler/impl:intellij.java.compiler.impl",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl",
        "//intellij-community/xml/dom-impl:intellij.xml.dom.impl",
        "//intellij-community/java/debugger/memory-agent:intellij.java.debugger.memory.agent",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.impl",
        "//intellij-community/java/idea-ui:intellij.java.ui",
        "//intellij-community/java/manifest:intellij.java.manifest",
        "//intellij-community/java/java-impl-inspections:intellij.java.impl.inspections",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl",
        "//intellij-community/java/java-indexing-impl:intellij.java.indexing.impl",
        "//intellij-community/java/jsp-spi:intellij.jsp.spi",
        "//intellij-community/uast/uast-java-ide:intellij.java.uast.ide",
        "//intellij-community/java/structuralsearch-java:intellij.java.structuralSearch",
        "//intellij-community/java/typeMigration:intellij.java.typeMigration",
        "//intellij-community/resources:intellij.java.resources",
        "//intellij-community/resources-en:intellij.java.resources.en",
        "//intellij-community/plugins/IntelliLang:intellij.java.langInjection",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/remote-servers/impl:intellij.java.remoteServers.impl[module]",
        "//intellij-community/plugins/ui-designer-core:intellij.uiDesigner[module]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
        "//intellij-community/java/idea-ui:intellij.java.ui.tests[module, test]",
    ],
)
