load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.cucumber.testRunner",
    srcs = ["src"],
    iml_files = ["intellij.cucumber.testRunner.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/cucumber-jvm-formatter:intellij.cucumber.jvmFormatter"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community:cucumber-core",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
    ],
)
