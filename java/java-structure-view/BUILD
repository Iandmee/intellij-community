load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.structureView",
    srcs = ["src"],
    iml_files = ["intellij.java.structureView.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/structure-view-impl:intellij.platform.structureView.impl"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/structure-view-impl:intellij.platform.structureView.impl[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl[module]",
    ],
)
