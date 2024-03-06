load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.toolingProxy",
    srcs = ["src"],
    iml_files = ["intellij.gradle.toolingProxy.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:Gradle",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension[module]",
    ],
)
