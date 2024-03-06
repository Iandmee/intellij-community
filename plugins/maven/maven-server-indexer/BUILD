load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.server.indexer",
    srcs = ["src"],
    iml_files = ["intellij.maven.server.indexer.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/maven-server-api:intellij.maven.server[module]",
        "//m2:apache.maven.indexer.core_6.2.2",
        "//m2:apache.maven.core_3.8.3",
        "//m2:apache.maven.wagon.provider.api_3.5.2",
        "//m2:apache.maven.archetype.common_3.2.1",
    ],
)
