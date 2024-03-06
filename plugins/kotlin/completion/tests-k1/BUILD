load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.completion.tests-k1",
    iml_files = ["kotlin.completion.tests-k1.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.kotlin-compiler-tests",
        "//intellij-community:Guava",
        "//intellij-community:gson",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/base/fe10/analysis:kotlin.base.fe10.analysis[module]",
        "//intellij-community/plugins/kotlin/formatter:kotlin.formatter[module]",
        "//intellij-community/plugins/kotlin/completion/impl-shared:kotlin.completion.impl-shared[module]",
        "//intellij-community/plugins/kotlin/completion/impl-k1:kotlin.completion.impl-k1[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/plugins/kotlin/completion/tests-shared:kotlin.completion.tests-shared[module, test]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module]",
        "//intellij-community/plugins/kotlin/frontend-independent/tests:kotlin.fir.frontend-independent.tests[module, test]",
        "//intellij-community/plugins/turboComplete:intellij.turboComplete[module, test]",
        "//intellij-community/plugins/turboComplete/languages/kotlin:intellij.turboComplete.languages.kotlin[module, test]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module, test]",
    ],
)
