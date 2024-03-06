load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.uast",
    srcs = ["src"],
    iml_files = ["intellij.java.uast.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/uast/uast-common:intellij.platform.uast"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
    ],
)
