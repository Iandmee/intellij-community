load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.jps",
    srcs = ["src"],
    iml_files = ["kotlin.base.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/compiler-configuration:kotlin.base.compiler-configuration[module]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/facet:kotlin.base.facet[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/java/compiler/impl:intellij.java.compiler.impl[module]",
    ],
)
