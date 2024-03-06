load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-plugins.parcelize.gradle",
    srcs = ["src"],
    iml_files = ["kotlin.compiler-plugins.parcelize.gradle.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/gradle/gradle-tooling/impl:kotlin.gradle.gradle-tooling.impl[module]",
        "//intellij-community/plugins/kotlin/compiler-plugins/parcelize/common:kotlin.compiler-plugins.parcelize.common[module]",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer.annotations[module]",
        "//intellij-community/plugins/gradle:intellij.gradle.common[module]",
    ],
)
