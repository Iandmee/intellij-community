load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.artifactResolver.m31",
    srcs = ["src"],
    iml_files = ["intellij.maven.artifactResolver.m31.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/plugins/maven/artifact-resolver/common:intellij.maven.artifactResolver.common"],
    # do not sort: must match IML order
    deps = [
        "//m2:org.apache.maven_maven-core_3.0.5",
        "//m2:org.sonatype.sisu_sisu-guice-no_aop_3.1.0",
        "//m2:org.codehaus.plexus_plexus-component-annotations_1.5.5",
        "//m2:org.eclipse.aether_aether-api_0.9.0.M2",
        "//intellij-community/plugins/maven/artifact-resolver/common:intellij.maven.artifactResolver.common[module]",
    ],
)
