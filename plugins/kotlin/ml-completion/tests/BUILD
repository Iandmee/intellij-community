load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.ml-completion.tests",
    iml_files = ["kotlin.ml-completion.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/kotlin/ml-completion:kotlin.ml-completion[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
    ],
)
