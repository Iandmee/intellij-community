load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-plugins.kotlinx-serialization.tests",
    iml_files = ["kotlin.compiler-plugins.kotlinx-serialization.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlinx-serialization-compiler-plugin",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community:kotlinc.kotlin-compiler-tests",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module, test]",
        "//intellij-community/plugins/kotlin/base/fe10/analysis:kotlin.base.fe10.analysis[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module]",
        "//intellij-community/plugins/kotlin/compiler-plugins/kotlinx-serialization/common:kotlin.compiler-plugins.kotlinx-serialization.common[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
    ],
)
