load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tasks.compatibility",
    srcs = ["src"],
    iml_files = ["intellij.tasks.compatibility.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:http-client-3.1"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/plugins/tasks/tasks-api:intellij.tasks[module]",
        "//intellij-community:http-client-3.1",
    ],
)
