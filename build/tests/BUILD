load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.idea.community.build.tests",
    iml_files = ["intellij.idea.community.build.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/build:intellij.idea.community.build[module, test]",
        "//intellij-community/platform/build-scripts/testFramework:intellij.platform.buildScripts.testFramework[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/util:intellij.platform.util[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module, test]",
    ],
)
