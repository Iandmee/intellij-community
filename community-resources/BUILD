load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.idea.community.customization",
    iml_files = ["intellij.idea.community.customization.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/java/ide-resources:intellij.java.ide.resources",
        "//m2:tips-idea-ce",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/idea/customization/base:intellij.idea.customization.base[module]",
    ],
)
