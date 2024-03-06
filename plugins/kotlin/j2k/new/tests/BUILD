load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.j2k.new.tests",
    iml_files = ["kotlin.j2k.new.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module, test]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module, test]",
        "//intellij-community/plugins/kotlin/base/fe10/analysis:kotlin.base.fe10.analysis[module]",
        "//intellij-community/plugins/kotlin/base/fe10/code-insight:kotlin.base.fe10.code-insight[module]",
        "//intellij-community/plugins/kotlin/j2k/old/tests:kotlin.j2k.old.tests[module, test]",
        "//intellij-community/plugins/kotlin/j2k/post-processing:kotlin.j2k.post-processing[module, test]",
        "//intellij-community/plugins/kotlin/j2k/new:kotlin.j2k.new[module, test]",
        "//intellij-community/plugins/kotlin/j2k/old:kotlin.j2k.old[module, test]",
        "//intellij-community/plugins/kotlin/j2k/idea:kotlin.j2k.idea[module, test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module, test]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module, test]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module, test]",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/plugins/kotlin/code-insight/utils:kotlin.code-insight.utils[module, test]",
    ],
)
