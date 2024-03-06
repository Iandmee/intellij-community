load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.manifest",
    srcs = ["src"],
    iml_files = ["intellij.java.manifest.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/analysis-api:intellij.platform.analysis[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
