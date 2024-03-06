load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.debugger.memory.agent",
    srcs = ["src"],
    iml_files = ["intellij.java.debugger.memory.agent.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//m2:debugger-memory-agent",
        "//intellij-community:commons-io",
        "//intellij-community:kotlin-stdlib",
    ],
)
