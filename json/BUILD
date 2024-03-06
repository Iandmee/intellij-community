load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.json",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.json.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/spellchecker:intellij.spellchecker[module]",
        "//intellij-community:Guava",
        "//intellij-community:gson",
        "//intellij-community/RegExpSupport:intellij.regexp[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson",
        "//intellij-community:jackson-dataformat-yaml",
    ],
)
