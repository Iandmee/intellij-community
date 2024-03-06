load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.java.maven",
    srcs = ["src"],
    iml_files = ["intellij.gradle.java.maven.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["plugin-resources"],
    test_srcs = ["testSources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/gradle/java:intellij.gradle.java[module]",
        "//intellij-community/plugins/maven:intellij.maven[module]",
        "//intellij-community/plugins/groovy:intellij.groovy[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/repository-search:intellij.repository.search[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
