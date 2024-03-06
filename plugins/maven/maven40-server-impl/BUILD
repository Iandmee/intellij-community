load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.server.m40",
    srcs = ["src"],
    iml_files = ["intellij.maven.server.m40.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/maven-server-api:intellij.maven.server[module]",
        "//m2:org.apache.maven_maven-embedder_4.0.0-alpha-8",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
