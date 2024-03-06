load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown.plugin",
    iml_files = ["intellij.markdown.plugin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/markdown/fenceInjection:intellij.markdown.fenceInjection[module]",
        "//intellij-community/plugins/markdown/frontmatter:intellij.markdown.frontmatter[module]",
        "//intellij-community/plugins/markdown/frontmatter/toml:intellij.markdown.frontmatter.toml[module]",
        "//intellij-community/plugins/markdown/frontmatter/yaml:intellij.markdown.frontmatter.yaml[module]",
        "//intellij-community/plugins/markdown/images:intellij.markdown.images[module]",
        "//intellij-community/plugins/markdown/model:intellij.markdown.model[module]",
        "//intellij-community/plugins/markdown/spellchecker:intellij.markdown.spellchecker[module]",
        "//intellij-community/plugins/markdown/xml:intellij.markdown.xml[module]",
    ],
)
