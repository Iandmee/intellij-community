load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.vcs.log.graph.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.vcs.log.graph.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/util:intellij.platform.util",
        "//intellij-community/platform/vcs-log/graph-api:intellij.platform.vcs.log.graph",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/vcs-log/graph-api:intellij.platform.vcs.log.graph[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:Guava",
        "//intellij-community:fastutil-min",
        "//intellij-community:assertJ[test]",
        "//intellij-community:kotlin-test[test]",
    ],
)
