load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.server.m3.impl",
    srcs = ["src"],
    iml_files = ["intellij.maven.server.m3.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/maven-server-api:intellij.maven.server[module]",
        "//intellij-community:commons-logging",
        "//intellij-community/plugins/maven:intellij.maven[module, test]",
        "//intellij-community/plugins/maven/maven3-server-common:intellij.maven.server.m3.common[module]",
        "//m2:org.apache.maven_maven-compat_3.3.9",
        "//m2:org.apache.maven.shared_maven-dependency-tree_1.2",
        "//m2:org.apache.maven_maven-core_3.3.9",
        "//m2:org.apache.maven_maven-embedder_3.3.9",
        "//m2:com.google.inject_guice-no_aop_4.0",
        "//m2:org.apache.maven.archetype_archetype-catalog_2.2",
        "//m2:org.apache.maven.archetype_archetype-common_2.2",
    ],
)
