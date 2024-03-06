load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.execution",
    srcs = ["src"],
    iml_files = ["intellij.java.execution.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/resources:intellij.java.resources[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
    ],
)
