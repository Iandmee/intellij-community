load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.externalSystem.dependencyUpdater",
    srcs = ["src"],
    iml_files = ["intellij.platform.externalSystem.dependencyUpdater.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.externalSystem.dependencyUpdater.tests",
    iml_files = ["intellij.platform.externalSystem.dependencyUpdater.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["testData"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/external-system-api/dependency-updater:intellij.platform.externalSystem.dependencyUpdater[module, test]",
        "//intellij-community/java/openapi:intellij.java[module, test]",
        "//intellij-community/plugins/groovy/groovy-psi:intellij.groovy.psi[module, test]",
        "//intellij-community/plugins/gradle:intellij.gradle[module, test]",
        "//intellij-community/plugins/gradle/java:intellij.gradle.java[module, test]",
        "//intellij-community/plugins/gradle:intellij.gradle.tests[module, test]",
        "//intellij-community/plugins/gradle/gradle-dependency-updater:intellij.gradle.dependencyUpdater[module, test]",
        "//intellij-community/plugins/maven:intellij.maven[module, test]",
        "//intellij-community/plugins/maven/testFramework:intellij.maven.testFramework[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
