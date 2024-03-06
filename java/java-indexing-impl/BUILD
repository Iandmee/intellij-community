load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.indexing.impl",
    srcs = ["src"],
    iml_files = ["intellij.java.indexing.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/java/java-psi-api:intellij.java.psi",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing",
        "//intellij-community/platform/indexing-impl:intellij.platform.indexing.impl",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/platform/indexing-impl:intellij.platform.indexing.impl[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community:Guava",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:fastutil-min",
    ],
)
