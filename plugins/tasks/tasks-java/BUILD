load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tasks.java",
    srcs = ["src"],
    iml_files = ["intellij.tasks.java.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/tasks/tasks-api:intellij.tasks[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/java/debugger/openapi:intellij.java.debugger[module]",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl[module]",
        "//intellij-community/platform/tasks-platform-api:intellij.platform.tasks[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/tasks-platform-impl:intellij.platform.tasks.impl[module]",
    ],
)
