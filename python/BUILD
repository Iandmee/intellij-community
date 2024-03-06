load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.helpers",
    iml_files = ["intellij.python.helpers.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    # do not sort: must match IML order
    resources = [
        "helpers",
        "helpers/pydev",
        "helpers/third_party/thriftpy",
    ],
    visibility = ["//visibility:public"],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.pydev",
    srcs = ["pydevSrc"],
    iml_files = ["intellij.python.pydev.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["pydevSrc/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community:XmlRPC",
        "//intellij-community:Guava",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:XStream",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.pycharm.community",
    srcs = ["ide-common/src"],
    iml_files = ["intellij.pycharm.community.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"ide-common/src": "com.intellij.pycharm.community"},
    # do not sort: must match IML order
    resources = [
        "ide-common/resources",
        "resources",
    ],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/xml/dom-impl:intellij.xml.dom.impl"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/notebooks/visualization:intellij.notebooks.visualization[module]",
        "//intellij-community/jupyter:intellij.jupyter.core[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community.impl",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.python.community.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["pluginResources"],
    test_resources = ["testData"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/python/openapi:intellij.python.community",
        "//intellij-community/RegExpSupport:intellij.regexp",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner",
        "//intellij-community/python/python-psi-impl:intellij.python.psi.impl",
        "//intellij-community/python/python-sdk:intellij.python.sdk",
    ],
    runtime_deps = ["//intellij-community/python:intellij.python.helpers"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/python/openapi:intellij.python.community[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:Guava",
        "//intellij-community/python:intellij.python.pydev[module]",
        "//intellij-community:XmlRPC",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/RegExpSupport:intellij.regexp[module]",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner[module]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community:kotlin-reflect",
        "//intellij-community:gson",
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community:XStream",
        "//intellij-community:libthrift",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community:netty-codec-http",
        "//intellij-community:jsoup",
        "//intellij-community:javax.annotation-api",
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community:Ant",
        "//intellij-community/python/python-psi-impl:intellij.python.psi.impl[module]",
        "//intellij-community/python/python-sdk:intellij.python.sdk[module]",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//m2:ml-completion-prev-exprs-models",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:netty-buffer",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/plugins/markdown:intellij.markdown[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jcef",
        "//intellij-community:jna",
        "//intellij-community/plugins/toml:intellij.toml[module]",
        "//m2:tuweni-toml",
        "//intellij-community:jsr305",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:caffeine",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/ml-api:intellij.platform.ml[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:jackson-dataformat-yaml",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community/python/python-core-impl:intellij.python.community.core.impl[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
        "//m2:completion-ranking-python-with-full-line",
        "//intellij-community/platform/backend/observation:intellij.platform.backend.observation[module]",
        "//intellij-community/plugins/terminal:intellij.terminal[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.pycharm.community.customization",
    iml_files = ["intellij.pycharm.community.customization.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["ide/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/python/ide/impl:intellij.pycharm.community.ide.impl[module]",
        "//intellij-community:tips-pycharm-community",
        "//intellij-community/jupyter/viewOnly:intellij.jupyter.viewOnly[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community.plugin.tests",
    iml_files = ["intellij.python.community.plugin.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_resources = ["pluginTestResources"],
    test_srcs = ["pluginTestSrc"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/IntelliLang:intellij.xml.langInjection"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community:JUnit4[test]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community.plugin.modules",
    iml_files = ["intellij.python.community.plugin.modules.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/python/IntelliLang-python:intellij.python.langInjection",
        "//intellij-community/python/python-copyright:intellij.python.copyright",
        "//intellij-community/python/python-terminal:intellij.python.terminal",
        "//intellij-community/python/python-rest:intellij.python.reStructuredText",
        "//intellij-community/python/python-grazie:intellij.python.grazie",
        "//intellij-community/python/python-markdown:intellij.python.markdown",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.pycharm.community.main",
    iml_files = ["intellij.pycharm.community.main.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/platform/bootstrap:intellij.platform.bootstrap",
        "//intellij-community/plugins/hg4idea:intellij.vcs.hg",
        "//intellij-community/plugins/svn4idea:intellij.vcs.svn",
        "//intellij-community/plugins/git4idea:intellij.vcs.git",
        "//intellij-community/plugins/git-features-trainer:intellij.vcs.git.featuresTrainer",
        "//intellij-community/xml/relaxng:intellij.relaxng",
        "//intellij-community/plugins/github:intellij.vcs.github",
        "//intellij-community/python:intellij.python.community.plugin.modules",
        "//intellij-community/plugins/configuration-script:intellij.configurationScript",
        "//intellij-community/plugins/completion-ml-ranking:intellij.completionMlRanking",
        "//intellij-community/plugins/stats-collector:intellij.statsCollector",
        "//intellij-community/plugins/terminal/sh:intellij.terminal.sh",
        "//intellij-community/plugins/completion-ml-ranking-models:intellij.completionMlRankingModels",
        "//intellij-community/plugins/emojipicker:intellij.emojipicker",
        "//intellij-community/plugins/grazie:intellij.grazie",
        "//intellij-community/platform/lvcs-impl:intellij.platform.lvcs.impl",
        "//intellij-community/plugins/search-everywhere-ml:intellij.searchEverywhereMl",
        "//intellij-community/plugins/dev/intellij.dev.plugin/noJava:intellij.dev.plugin.noJava",
        "//intellij-community/plugins/evaluation-plugin:intellij.evaluationPlugin",
        "//intellij-community/plugins/evaluation-plugin/languages/python:intellij.evaluationPlugin.languages.python",
        "//intellij-community/platform/new-ui-onboarding:intellij.platform.ide.newUiOnboarding",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/python/rest:intellij.reStructuredText[module]",
        "//intellij-community/plugins/terminal:intellij.terminal[module]",
        "//intellij-community/python:intellij.pycharm.community[module]",
        "//intellij-community/python:intellij.pycharm.community.customization[module]",
        "//intellij-community/python/pluginCore:intellij.python.community.plugin[module]",
        "//intellij-community/platform/platform-main:intellij.platform.main[module]",
        "//intellij-community/plugins/tasks/tasks-core/jira:intellij.tasks.jira[module]",
        "//intellij-community/plugins/settings-repository:intellij.settingsRepository[module]",
        "//intellij-community/plugins/properties:intellij.properties[module]",
        "//intellij-community/plugins/markdown:intellij.markdown[module]",
        "//intellij-community/plugins/markdown/plugin:intellij.markdown.plugin[module]",
        "//intellij-community/plugins/sh:intellij.sh[module]",
        "//intellij-community/plugins/changeReminder:intellij.vcs.changeReminder[module]",
        "//intellij-community/plugins/IntelliLang:intellij.xml.langInjection[module]",
        "//intellij-community/plugins/textmate:intellij.textmate[module]",
        "//intellij-community/plugins/color-schemes/monokai-color-scheme:intellij.color.scheme.monokai[module]",
        "//intellij-community/plugins/color-schemes/twilight-color-scheme:intellij.color.scheme.twilight[module]",
        "//intellij-community/plugins/color-schemes/warm-neon-color-scheme:intellij.color.scheme.warmNeon[module]",
        "//intellij-community/plugins/color-schemes/github-color-scheme:intellij.color.scheme.github[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community.plugin.main",
    iml_files = ["intellij.python.community.plugin.main.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/python/pluginCore:intellij.python.community.plugin[module]",
        "//intellij-community/python/pluginJava:intellij.python.community.plugin.java[module]",
        "//intellij-community/python/pluginMinor:intellij.python.community.plugin.minor[module]",
        "//intellij-community/python:intellij.python.community.plugin.modules[module]",
        "//intellij-community:intellij.idea.community.main[module]",
    ],
)
