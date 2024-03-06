load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.grazie.tests",
    iml_files = ["intellij.grazie.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["kotlin"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/plugins/grazie:intellij.grazie",
        "//intellij-community/java/testFramework:intellij.java.testFramework",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/plugins/grazie:intellij.grazie[module]",
        "//intellij-community:kotlin-test",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//m2:org.languagetool_languagetool-core",
        "//m2:org.languagetool_language-ru[test]",
        "//m2:org.languagetool_language-de[test]",
        "//m2:org.languagetool_language-it[test]",
        "//intellij-community:StreamEx[test]",
        "//intellij-community/RegExpSupport:intellij.regexp[module, test]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module, test]",
        "//intellij-community/plugins/grazie/java:intellij.grazie.java[module, test]",
        "//intellij-community/plugins/markdown:intellij.markdown[module, test]",
        "//intellij-community/plugins/markdown/plugin:intellij.markdown.plugin[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/plugins/grazie/markdown:intellij.grazie.markdown[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
