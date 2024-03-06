load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.markdown",
    srcs = ["src"],
    iml_files = ["intellij.python.markdown.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/markdown:intellij.markdown[module]",
        "//intellij-community/plugins/markdown/plugin:intellij.markdown.plugin[module, test]",
        "//intellij-community/python/python-psi-impl:intellij.python.psi.impl[module]",
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/python/testSrc:intellij.python.community.tests[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
