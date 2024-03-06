load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.ui",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.java.ui.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/java/compiler/impl:intellij.java.compiler.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/java-impl-refactorings:intellij.java.impl.refactorings[module]",
        "//intellij-community/aether-dependency-resolver:intellij.java.aetherDependencyResolver[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community:jna",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.impl[module]",
        "//intellij-community:StreamEx",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/feedback:intellij.platform.feedback[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.ui.tests",
    iml_files = ["intellij.java.ui.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/aether-dependency-resolver:intellij.java.aetherDependencyResolver[module, test]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/platform-tests:intellij.platform.tests[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module, test]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module, test]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module, test]",
    ],
)
