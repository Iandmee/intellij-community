load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.ae.database.counters.community",
    srcs = ["src"],
    iml_files = ["intellij.ae.database.counters.community.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/plugins/feature-usage-database/core:intellij.ae.database.core[module]",
        "//intellij-community/platform/sqlite:intellij.platform.sqlite[module]",
        "//intellij-community:assertJ[test]",
    ],
)
