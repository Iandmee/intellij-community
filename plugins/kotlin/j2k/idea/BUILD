load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.j2k.idea",
    srcs = ["src"],
    iml_files = ["kotlin.j2k.idea.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/fe10/analysis:kotlin.base.fe10.analysis[module]",
        "//intellij-community/plugins/kotlin/base/fe10/code-insight:kotlin.base.fe10.code-insight[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module]",
        "//intellij-community/plugins/kotlin/j2k/old:kotlin.j2k.old[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl[module]",
    ],
)
