load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.uast.uast-kotlin-idea-fir",
    srcs = ["src"],
    iml_files = ["kotlin.uast.uast-kotlin-idea-fir.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/kotlin/gradle/gradle:kotlin.gradle.gradle"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module, test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:kotlinc.high-level-api-fir",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-base:kotlin.uast.uast-kotlin-base[module]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module]",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-idea-base:kotlin.uast.uast-kotlin-idea-base[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/uast/uast-common:intellij.platform.uast[module]",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin-fir:kotlin.uast.uast-kotlin-fir[module]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
    ],
)
