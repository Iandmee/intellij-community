load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.toolingExtension.impl",
    srcs = ["src"],
    iml_files = ["intellij.gradle.toolingExtension.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/external-system-rt:intellij.platform.externalSystem.rt[module]",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension[module]",
        "//intellij-community:Gradle",
        "//intellij-community:gson",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer.annotations[module]",
        "//intellij-community:ion",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.toolingExtension.tests",
    iml_files = ["intellij.gradle.toolingExtension.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    test_resources = ["testData"],
    test_srcs = ["testSources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module, test]",
        "//intellij-community/plugins/gradle:intellij.gradle.common[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community:assertJ[test]",
        "//m2:io.github.classgraph_classgraph_4.8.87[test]",
        "//m2:org.jeasy_easy-random-core_4.2.0[test]",
        "//intellij-community:ion[test]",
        "//intellij-community:fastutil-min[test]",
        "//intellij-community/platform/boot:intellij.platform.boot[module, test]",
        "//intellij-community/plugins/gradle:intellij.gradle[module, test]",
    ],
)
