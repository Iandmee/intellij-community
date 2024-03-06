load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-plugins.lombok.maven",
    srcs = ["src"],
    iml_files = ["kotlin.compiler-plugins.lombok.maven.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.lombok-compiler-plugin",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/maven:kotlin.maven[module]",
        "//intellij-community/plugins/kotlin/compiler-plugins/compiler-plugin-support/common:kotlin.compiler-plugins.compiler-plugin-support.common[module]",
        "//intellij-community/plugins/kotlin/compiler-plugins/compiler-plugin-support/maven:kotlin.compiler-plugins.compiler-plugin-support.maven[module]",
        "//intellij-community/plugins/maven:intellij.maven[module]",
    ],
)
