load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tools.testsBootstrap",
    srcs = ["src"],
    iml_files = ["intellij.tools.testsBootstrap.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/platform/boot:intellij.platform.boot"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit4",
        "//intellij-community:JUnit5Launcher",
        "//intellij-community:JUnit5",
        "//intellij-community:JUnit5Vintage",
        "//intellij-community:tcServiceMessages",
        "//intellij-community:JUnit5Jupiter",
    ],
)
