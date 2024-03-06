load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.tools",
    srcs = ["src"],
    iml_files = ["intellij.python.tools.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/python:intellij.pycharm.community",
        "//intellij-community/python/pluginCore:intellij.python.community.plugin",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community:kotlin-script-runtime",
        "//intellij-community:Ant",
        "//intellij-community/python/testFramework:intellij.python.community.testFramework[module]",
    ],
)
