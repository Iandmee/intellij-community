load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.compiler-configuration",
    srcs = ["src"],
    iml_files = ["kotlin.base.compiler-configuration.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
    ],
)
