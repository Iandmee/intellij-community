load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.testFramework",
    srcs = ["src"],
    iml_files = ["intellij.maven.testFramework.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community/plugins/maven:intellij.maven[module]",
        "//m2:io.takari.maven.wrapper",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/plugins/repository-search:intellij.repository.search[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
    ],
)
