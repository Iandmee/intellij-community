load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.wsl.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.wsl.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/execution:intellij.platform.execution[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community:lz4-java",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community:ktor-network-tls",
    ],
)
