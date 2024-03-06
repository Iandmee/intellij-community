load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.j2k.old.post-processing",
    srcs = ["src"],
    iml_files = ["kotlin.j2k.old.post-processing.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module]",
        "//intellij-community/plugins/kotlin/j2k/idea:kotlin.j2k.idea[module]",
        "//intellij-community/plugins/kotlin/code-insight/impl-base:kotlin.code-insight.impl-base[module]",
        "//intellij-community/plugins/kotlin/code-insight/intentions-shared:kotlin.code-insight.intentions-shared[module]",
        "//intellij-community/plugins/kotlin/base/fe10/analysis:kotlin.base.fe10.analysis[module]",
        "//intellij-community/plugins/kotlin/code-insight/api:kotlin.code-insight.api[module]",
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/fe10/code-insight:kotlin.base.fe10.code-insight[module]",
    ],
)
