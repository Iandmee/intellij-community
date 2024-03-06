load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.testsFromCompiler",
    iml_files = ["kotlin.testsFromCompiler.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/platform/util/trove:intellij.platform.util.trove"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlinc.kotlin-jps-plugin-classpath[test]",
        "//intellij-community:kotlinc.kotlin-jps-plugin-tests[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module, test]",
        "//intellij-community/plugins/kotlin/util/compiler-dependencies:kotlin.util.compiler-dependencies[module, test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community/plugins/devkit/jps-plugin:intellij.devkit.jps[module, test]",
    ],
)
