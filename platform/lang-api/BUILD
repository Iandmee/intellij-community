load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.lang",
    srcs = ["src"],
    iml_files = ["intellij.platform.lang.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/platform-api:intellij.platform.ide",
        "//intellij-community/platform/lang-core:intellij.platform.lang.core",
        "//intellij-community/platform/lvcs-api:intellij.platform.lvcs",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis",
        "//intellij-community/platform/code-style-api:intellij.platform.codeStyle",
        "//intellij-community/platform/execution:intellij.platform.execution",
        "//intellij-community/platform/refactoring:intellij.platform.refactoring",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-core:intellij.platform.lang.core[module]",
        "//intellij-community/platform/lvcs-api:intellij.platform.lvcs[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:jmock[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:hamcrest[test]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/code-style-api:intellij.platform.codeStyle[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/execution:intellij.platform.execution[module]",
        "//intellij-community/platform/refactoring:intellij.platform.refactoring[module]",
        "//intellij-community/platform/ml-api:intellij.platform.ml[module]",
    ],
)
