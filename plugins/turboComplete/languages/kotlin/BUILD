load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.turboComplete.languages.kotlin",
    srcs = ["src"],
    iml_files = ["intellij.turboComplete.languages.kotlin.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/completion/impl-k1:kotlin.completion.impl-k1[module]",
        "//intellij-community/platform/ml-impl:intellij.platform.ml.impl[module]",
        "//m2:completion-performance-kotlin",
        "//intellij-community/plugins/turboComplete:intellij.turboComplete[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
    ],
)
