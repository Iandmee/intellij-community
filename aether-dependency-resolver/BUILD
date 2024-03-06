load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.aetherDependencyResolver",
    srcs = ["src"],
    iml_files = ["intellij.java.aetherDependencyResolver.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:http-client",
        "//intellij-community:commons-logging",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community:maven-resolver-provider",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:http-client",
        "//intellij-community:commons-logging",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:maven-resolver-provider",
        "//m2:org.apache.maven.resolver_maven-resolver-transport-file",
        "//m2:org.apache.maven.resolver_maven-resolver-transport-http",
        "//m2:org.apache.maven.resolver_maven-resolver-connector-basic",
        "//intellij-community:commons-lang3",
        "//intellij-community:plexus-utils",
        "//intellij-community:commons-codec",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)
