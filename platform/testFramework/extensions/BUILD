load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.testExtensions",
    srcs = ["src"],
    iml_files = ["intellij.platform.testExtensions.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:memoryfilesystem",
        "//intellij-community:assertJ",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:memoryfilesystem",
        "//intellij-community:assertJ",
        "//intellij-community:snakeyaml",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:JUnit5",
    ],
)
