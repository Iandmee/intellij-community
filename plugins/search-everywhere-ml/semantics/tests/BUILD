load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.searchEverywhereMl.semantics.tests",
    iml_files = ["intellij.searchEverywhereMl.semantics.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["testData"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/search-everywhere-ml/semantics:intellij.searchEverywhereMl.semantics[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/search-everywhere-ml/semantics/java:intellij.searchEverywhereMl.semantics.java[module, test]",
        "//intellij-community/plugins/search-everywhere-ml/semantics/kotlin:intellij.searchEverywhereMl.semantics.kotlin[module, test]",
        "//intellij-community/plugins/kotlin:intellij.kotlin.plugin.community.main[module, test]",
        "//intellij-community/plugins/search-everywhere-ml:intellij.searchEverywhereMl[module, test]",
        "//intellij-community/platform/ml-embeddings:intellij.platform.ml.embeddings[module]",
        "//intellij-community:kotlinx-coroutines-test[test]",
    ],
)
