load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.backend.workspace",
    srcs = ["src"],
    iml_files = ["intellij.platform.backend.workspace.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij.platform.backend.workspace"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
    ],
)
