load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.searchEverywhereMl.typos",
    srcs = ["src"],
    iml_files = ["intellij.searchEverywhereMl.typos.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/plugins/grazie/src:intellij.grazie.core[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//m2:ai.grazie.spell.gec.engine.local",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/plugins/search-everywhere-ml:intellij.searchEverywhereMl[module]",
        "//intellij-community:fastutil-min",
    ],
)
