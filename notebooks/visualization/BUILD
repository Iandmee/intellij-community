load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.notebooks.visualization",
    srcs = ["src"],
    iml_files = ["intellij.notebooks.visualization.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:gson",
        "//intellij-community/images:intellij.platform.images[module]",
        "//intellij-community:jcef",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/notebooks/notebook-ui:intellij.notebooks.ui[module]",
    ],
)
