load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.completionMlRankingModels",
    srcs = ["src"],
    iml_files = ["intellij.completionMlRankingModels.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking[module]",
        "//m2:completion-ranking-java-exp",
        "//m2:completion-ranking-java-exp2",
        "//m2:completion-ranking-kotlin-exp",
        "//m2:completion-ranking-scala-exp",
        "//m2:completion-ranking-rust-exp",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//m2:completion-ranking-python-exp",
        "//m2:completion-ranking-php-exp",
        "//m2:completion-ranking-ruby-exp",
        "//m2:completion-ranking-go-exp",
        "//m2:completion-ranking-js-exp",
        "//m2:completion-ranking-typescript-exp",
        "//m2:completion-ranking-dart-exp",
        "//m2:completion-ranking-swift-exp",
        "//m2:completion-ranking-cpp-exp",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.completionMlRankingModels.tests",
    iml_files = ["intellij.completionMlRankingModels.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/completion-ml-ranking-models:intellij.completionMlRankingModels[module, test]",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking[module, test]",
    ],
)
