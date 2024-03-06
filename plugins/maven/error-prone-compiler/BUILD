load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.errorProne.compiler",
    srcs = ["src/main/java"],
    iml_files = ["intellij.maven.errorProne.compiler.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/maven:intellij.maven[module]",
        "//intellij-community:kotlin-stdlib",
    ],
)
