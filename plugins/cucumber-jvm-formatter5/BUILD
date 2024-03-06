load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.cucumber.jvmFormatter5",
    srcs = ["src"],
    iml_files = ["intellij.cucumber.jvmFormatter5.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/cucumber-jvm-formatter:intellij.cucumber.jvmFormatter[module]",
        "//m2:cucumber-java_5.0.0-RC1",
    ],
)
