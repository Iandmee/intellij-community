load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.analysis",
    srcs = ["src"],
    iml_files = ["intellij.java.analysis.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/uast/uast-common:intellij.platform.uast",
        "//intellij-community/uast/uast-common-ide:intellij.platform.uast.ide",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/uast/uast-common-ide:intellij.platform.uast.ide[module]",
    ],
)
