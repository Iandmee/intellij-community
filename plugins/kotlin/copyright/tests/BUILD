load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.copyright.tests",
    iml_files = ["kotlin.copyright.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/platform/ide-core:intellij.platform.ide.core",
        "//intellij-community/java/java-analysis-api:intellij.java.analysis",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-tests",
        "//intellij-community:JUnit4",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/copyright:kotlin.copyright[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module]",
        "//intellij-community/plugins/copyright:intellij.copyright[module]",
    ],
)
