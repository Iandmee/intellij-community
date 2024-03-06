load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.server.eventListener",
    srcs = ["src/main/java"],
    iml_files = ["intellij.maven.server.eventListener.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    resources = ["src/main/resources"],
    test_srcs = ["src/test/java"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//m2:org.apache.maven_maven-core_3.3.9",
        "//m2:com.google.inject_guice-no_aop_4.0",
        "//intellij-community:JUnit5[test]",
    ],
)
