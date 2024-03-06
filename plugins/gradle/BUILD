load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.common",
    # do not sort: must match IML order
    srcs = [
        "generated",
        "src",
    ],
    iml_files = ["intellij.gradle.common.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.impl",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community:Gradle",
        "//intellij-community/platform/inspect:intellij.platform.inspect",
        "//intellij-community/platform/external-system-api/dependency-updater:intellij.platform.externalSystem.dependencyUpdater",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.impl[module]",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension[module]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module]",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community:Gradle",
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community:gson",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer.annotations[module]",
        "//intellij-community:ion",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/inspect:intellij.platform.inspect[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community:commons-cli",
        "//intellij-community/plugins/properties/properties-psi-impl:intellij.properties.psi.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/plugins/gradle/tooling-proxy:intellij.gradle.toolingProxy[module]",
        "//intellij-community/platform/external-system-api/dependency-updater:intellij.platform.externalSystem.dependencyUpdater[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community:commons-lang3",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle",
    iml_files = ["intellij.gradle.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["plugin-resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/gradle:intellij.gradle.common"],
    deps = ["//intellij-community/plugins/gradle:intellij.gradle.common[module]"],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.tests",
    iml_files = ["intellij.gradle.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = [
        "testData",
        "testSources",
    ],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.tests",
        "//intellij-community/platform/external-system-api/testFramework:intellij.platform.externalSystem.testFramework",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.tests",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jmock[test]",
        "//intellij-community:jmock.junit4[test]",
        "//intellij-community:jmock.legacy[test]",
        "//intellij-community:mockito[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/gradle:intellij.gradle[module, test]",
        "//intellij-community/plugins/gradle:intellij.gradle.common[module, test]",
        "//intellij-community/plugins/gradle/java:intellij.gradle.java[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.tests[module, test]",
        "//intellij-community/platform/external-system-api/testFramework:intellij.platform.externalSystem.testFramework[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.tests[module, test]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:org.codehaus.groovy_groovy-json[test]",
        "//intellij-community:commons-cli[test]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module, test]",
        "//intellij-community/platform/boot:intellij.platform.boot[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
        "//intellij-community/plugins/groovy:intellij.groovy[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module, test]",
    ],
)
