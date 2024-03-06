load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.cucumber.jvmFormatter3",
    srcs = ["src"],
    iml_files = ["intellij.cucumber.jvmFormatter3.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//m2:cucumber-core_3.0.2",
        "//intellij-community/plugins/cucumber-jvm-formatter:intellij.cucumber.jvmFormatter[module]",
    ],
)
