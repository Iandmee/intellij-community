load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.spellchecker",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.spellchecker.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    # do not sort: must match IML order
    resources = [
        "resources",
        "compatibilityResources",
    ],
    test_resources = ["testResources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community:Guava",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//m2:ai.grazie.spell.gec.engine.local",
        "//m2:ai.grazie.utils.common",
        "//m2:ai.grazie.nlp.common",
        "//m2:ai.grazie.nlp.tokenizer",
        "//m2:ai.grazie.nlp.langs",
        "//m2:ai.grazie.nlp.similarity",
        "//m2:ai.grazie.nlp.patterns",
        "//m2:ai.grazie.nlp.phonetics",
        "//m2:ai.grazie.nlp.detect",
        "//m2:ai.grazie.spell.hunspell.en",
        "//m2:ai.grazie.nlp.stemmer",
        "//m2:ai.grazie.model.gec",
        "//m2:ai.grazie.model.text",
        "//m2:ai.grazie.model.common",
        "//m2:ai.grazie.utils.lucene.lt.compatibility",
        "//m2:java-string-similarity",
        "//intellij-community:lucene-core",
        "//intellij-community:lucene-analysis-common",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:caffeine",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
