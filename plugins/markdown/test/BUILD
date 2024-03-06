load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown.tests",
    iml_files = ["intellij.markdown.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["data"],
    test_srcs = ["src"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/markdown:intellij.markdown[module]",
        "//intellij-community/plugins/markdown/fenceInjection:intellij.markdown.fenceInjection[module]",
        "//intellij-community/plugins/markdown/frontmatter:intellij.markdown.frontmatter[module]",
        "//intellij-community/plugins/markdown/frontmatter/toml:intellij.markdown.frontmatter.toml[module]",
        "//intellij-community/plugins/markdown/frontmatter/yaml:intellij.markdown.frontmatter.yaml[module]",
        "//intellij-community/plugins/markdown/images:intellij.markdown.images[module]",
        "//intellij-community/plugins/markdown/model:intellij.markdown.model[module]",
        "//intellij-community/plugins/markdown/spellchecker:intellij.markdown.spellchecker[module]",
        "//intellij-community/plugins/markdown/xml:intellij.markdown.xml[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/platform/built-in-server-api:intellij.platform.builtInServer[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/plugins/IntelliLang:intellij.xml.langInjection[module, test]",
        "//intellij-community/platform/platform-tests:intellij.platform.tests[module, test]",
        "//intellij-community:jsoup",
        "//intellij-community:jcef",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community:jetbrains.markdown",
        "//intellij-community/plugins/toml:intellij.toml[module]",
        "//intellij-community/plugins/yaml:intellij.yaml[module]",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
    ],
)
