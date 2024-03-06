load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.jvm.analysis",
    srcs = ["src"],
    iml_files = ["intellij.jvm.analysis.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/uast/uast-common:intellij.platform.uast",
        "//intellij-community/java/java-psi-api:intellij.java.psi",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis",
        "//intellij-community/uast/uast-common-ide:intellij.platform.uast.ide",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/java/java-analysis-api:intellij.java.analysis[module]",
        "//intellij-community/uast/uast-common-ide:intellij.platform.uast.ide[module]",
    ],
)
