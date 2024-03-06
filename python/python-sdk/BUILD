load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.sdk",
    srcs = ["src"],
    iml_files = ["intellij.python.sdk.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:gson",
        "//intellij-community:Guava",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/python/openapi:intellij.python.community[module]",
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/python/python-psi-impl:intellij.python.psi.impl[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/ide-core:intellij.platform.ide.core[module]",
        "//intellij-community/platform/execution:intellij.platform.execution[module]",
        "//intellij-community/platform/remote-core:intellij.platform.remote.core[module]",
        "//intellij-community:jna",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:caffeine",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
    ],
)
