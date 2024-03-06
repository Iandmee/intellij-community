load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-plugins.allopen.common",
    srcs = ["src"],
    iml_files = ["kotlin.compiler-plugins.allopen.common.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.allopen-compiler-plugin",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/compiler-plugins/compiler-plugin-support/common:kotlin.compiler-plugins.compiler-plugin-support.common[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
    ],
)
