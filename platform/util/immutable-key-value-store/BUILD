load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.immutableKeyValueStore",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.immutableKeyValueStore.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community:assertJ[test]",
        "//intellij-community:JUnit5Params[test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community/platform/util/rt-java8:intellij.platform.util.rt.java8[module, test]",
    ],
)
