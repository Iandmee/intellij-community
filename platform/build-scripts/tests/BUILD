load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.buildScripts.tests",
    iml_files = ["intellij.platform.buildScripts.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["testResources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/build-scripts:intellij.platform.buildScripts[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:opentelemetry[test]",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module, test]",
        "//intellij-community/platform/util:intellij.platform.util[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community:decentxml[test]",
        "//intellij-community/build/tasks:intellij.idea.community.build.tasks[module, test]",
        "//intellij-community:kotlinx-collections-immutable[test]",
        "//intellij-community:commons-compress[test]",
        "//intellij-community/build:intellij.idea.community.build[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module, test]",
    ],
)
