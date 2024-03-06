load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.json.tests",
    iml_files = ["intellij.json.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["testData"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/json:intellij.json[module, test]",
        "//intellij-community/spellchecker:intellij.spellchecker[module, test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/plugins/IntelliLang:intellij.platform.langInjection[module, test]",
        "//intellij-community:jsonpath[test]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/RegExpSupport:intellij.regexp[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
