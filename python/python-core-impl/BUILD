load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community.core.impl",
    srcs = ["src"],
    iml_files = ["intellij.python.community.core.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/RegExpSupport:intellij.regexp[module]",
        "//intellij-community:Guava",
        "//intellij-community/python/python-psi-impl:intellij.python.psi.impl[module]",
        "//intellij-community/python/python-sdk:intellij.python.sdk[module]",
    ],
)
