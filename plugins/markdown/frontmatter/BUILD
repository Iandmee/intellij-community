load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown.frontmatter",
    srcs = ["src/main/kotlin"],
    iml_files = ["intellij.markdown.frontmatter.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/plugins/IntelliLang:intellij.platform.langInjection[module]",
        "//intellij-community/plugins/markdown/core:intellij.markdown.core[module]",
        "//intellij-community/plugins/markdown/frontmatter/toml:intellij.markdown.frontmatter.toml[module]",
        "//intellij-community/plugins/markdown/frontmatter/yaml:intellij.markdown.frontmatter.yaml[module]",
        "//intellij-community/json:intellij.json[module]",
        "//intellij-community/platform/localIde:intellij.platform.localIde[module]",
    ],
)
