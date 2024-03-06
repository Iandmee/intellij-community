load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.markdown.frontmatter.yaml",
    srcs = ["src/main/kotlin"],
    iml_files = ["intellij.markdown.frontmatter.yaml.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/plugins/IntelliLang:intellij.platform.langInjection[module]",
        "//intellij-community/plugins/markdown/core:intellij.markdown.core[module]",
        "//intellij-community/plugins/yaml:intellij.yaml[module]",
        "//intellij-community/platform/localIde:intellij.platform.localIde[module]",
    ],
)
