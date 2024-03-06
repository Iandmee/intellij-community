load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.markdown.utils",
    srcs = ["src"],
    iml_files = ["intellij.platform.markdown.utils.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains.markdown",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlin-test[test]",
    ],
)
