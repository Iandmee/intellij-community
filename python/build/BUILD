load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.pycharm.community.build",
    srcs = ["src"],
    iml_files = ["intellij.pycharm.community.build.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/build:intellij.idea.community.build[module]",
        "//intellij-community/platform/build-scripts/testFramework:intellij.platform.buildScripts.testFramework[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module]",
        "//intellij-community/build/tasks:intellij.idea.community.build.tasks[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community:opentelemetry-extension-kotlin",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/ide-core:intellij.platform.ide.core[module]",
        "//intellij-community/python/python-sdk:intellij.python.sdk[module]",
        "//intellij-community/python/python-parser:intellij.python.parser[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community:jsoup",
    ],
)
