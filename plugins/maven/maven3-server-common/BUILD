load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.server.m3.common",
    srcs = ["src"],
    iml_files = ["intellij.maven.server.m3.common.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/maven-server-api:intellij.maven.server[module]",
        "//intellij-community:commons-logging",
        "//m2:org.sonatype.nexus_nexus-indexer-artifact_1.0.1",
        "//m2:org.sonatype.nexus_nexus-indexer_3.0.4",
        "//m2:org.apache.maven.shared_maven-dependency-tree_1.2",
        "//m2:org.apache.maven.archetype_archetype-common_2.2",
        "//m2:org.apache.maven_maven-compat_3.6.0",
        "//m2:com.google.inject_guicen-no_aop_4.2.1",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//m2:org.apache.lucene_lucene-core_2.4.1",
    ],
)
