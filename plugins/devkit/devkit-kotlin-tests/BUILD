load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.kotlin.tests",
    iml_files = ["intellij.devkit.kotlin.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_friends = ["//intellij-community/plugins/devkit/intellij.kotlin.devkit"],
    test_resources = ["testData"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/devkit/intellij.devkit"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/devkit/devkit-tests:intellij.devkit.testFramework[module]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/plugins/devkit/devkit-java-tests:intellij.devkit.java.tests[module, test]",
        "//intellij-community/plugins/java-i18n:intellij.java.i18n[module, test]",
        "//intellij-community/plugins/devkit/intellij.devkit.themes[module, test]",
        "//intellij-community/plugins/devkit/intellij.kotlin.devkit[module, test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community/plugins/kotlin:intellij.kotlin.plugin.community.main[module, test]",
    ],
)
