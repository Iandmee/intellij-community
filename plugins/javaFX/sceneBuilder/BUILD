load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.javaFX.sceneBuilder",
    srcs = ["src"],
    iml_files = ["intellij.javaFX.sceneBuilder.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/plugins/javaFX:intellij.javaFX[module]",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//m2:SceneBuilderKit11",
        "//intellij-community/platform/indexing-impl:intellij.platform.indexing.impl[module]",
    ],
)
