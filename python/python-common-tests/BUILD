load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.commonTests",
    iml_files = ["intellij.python.commonTests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit4[test]",
        "//intellij-community/python/python-psi-api:intellij.python.psi[module, test]",
        "//intellij-community/platform/core-api:intellij.platform.core[module, test]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module, test]",
        "//intellij-community/python/python-psi-impl:intellij.python.psi.impl[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module, test]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module, test]",
        "//intellij-community:Guava[test]",
        "//intellij-community:StreamEx[test]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module, test]",
        "//intellij-community/platform/code-style-api:intellij.platform.codeStyle[module, test]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module, test]",
    ],
)
