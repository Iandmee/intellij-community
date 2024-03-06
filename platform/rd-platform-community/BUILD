load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.rd.community",
    srcs = ["src"],
    iml_files = ["intellij.platform.rd.community.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:rd-core",
        "//intellij-community:rd-framework",
        "//intellij-community:rd-swing",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community:rd-core",
        "//intellij-community:rd-framework",
        "//intellij-community:rd-text",
        "//intellij-community:rd-swing",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
    ],
)
