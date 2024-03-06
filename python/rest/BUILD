load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.reStructuredText",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.reStructuredText.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_resources = ["testData"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:jcef",
        "//intellij-community:jsoup",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
