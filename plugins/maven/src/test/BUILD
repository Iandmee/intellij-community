load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.tests",
    iml_files = ["intellij.maven.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["resources"],
    test_srcs = ["java"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/maven:intellij.maven[module, test]",
        "//intellij-community/plugins/maven/testFramework:intellij.maven.testFramework[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/plugins/repository-search:intellij.repository.search[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/external-system-api/dependency-updater:intellij.platform.externalSystem.dependencyUpdater[module, test]",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.tests[module, test]",
        "//intellij-community/plugins/properties/properties-psi-api:intellij.properties.psi[module, test]",
        "//intellij-community/spellchecker:intellij.spellchecker[module, test]",
        "//intellij-community/plugins/groovy:intellij.groovy[module, test]",
        "//intellij-community/plugins/groovy/jps-plugin:intellij.groovy.jps[module, test]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module, test]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module, test]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module, test]",
        "//intellij-community:Guava[test]",
        "//intellij-community/plugins/maven/artifact-resolver/common:intellij.maven.artifactResolver.common[module, test]",
        "//intellij-community:mockito[test]",
        "//intellij-community/plugins/maven/jps-plugin:intellij.maven.jps[module, test]",
        "//intellij-community/plugins/maven/maven3-server-common:intellij.maven.server.m3.common[module, test]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module, test]",
        "//intellij-community/platform/external-system-api/testFramework:intellij.platform.externalSystem.testFramework[module, test]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module, test]",
        "//intellij-community/java/java-impl:intellij.java.impl[module, test]",
    ],
)
