load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.sqlite",
    srcs = ["src"],
    iml_files = ["intellij.platform.sqlite.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community:sqlite-native"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
    ],
)
