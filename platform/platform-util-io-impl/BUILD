load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.ide.util.io.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.ide.util.io.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/util/base:intellij.platform.util.base[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:pty4j",
        "//intellij-community:winp",
        "//intellij-community:proxy-vole",
        "//intellij-community:jna",
        "//intellij-community:jackson",
    ],
)
