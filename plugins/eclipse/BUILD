load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.eclipse",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.eclipse.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/plugins/eclipse/jps-plugin:intellij.eclipse.jps[module]",
        "//intellij-community/plugins/eclipse/common-eclipse-util:intellij.eclipse.common[module]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community:kotlin-reflect",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
    ],
)
