load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.immutableKeyValueStore.benchmark",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.immutableKeyValueStore.benchmark.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij.platform.util.immutableKeyValueStore.benchmark"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jmh-core",
        "//intellij-community:jmh-generator-annprocess",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util/immutable-key-value-store:intellij.platform.util.immutableKeyValueStore[module]",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module]",
        "//intellij-community/platform/util/rt-java8:intellij.platform.util.rt.java8[module]",
    ],
)
