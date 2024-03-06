load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.ex",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.ex.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:jcip",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:fastutil-min",
        "//intellij-community:netty-buffer",
        "//intellij-community:caffeine",
        "//intellij-community/platform/util/base:intellij.platform.util.base[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community:lz4-java",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
