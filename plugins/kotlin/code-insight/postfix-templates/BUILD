load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.code-insight.postfix-templates-k2",
    srcs = ["src"],
    iml_files = ["kotlin.code-insight.postfix-templates-k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:kotlinc.high-level-api",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/psi:kotlin.base.psi[module]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/test:kotlin.base.test[module, test]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/code-insight/live-templates-shared:kotlin.code-insight.live-templates-shared[module]",
        "//intellij-community/plugins/kotlin/code-insight/live-templates-k2:kotlin.code-insight.live-templates-k2[module]",
        "//intellij-community/plugins/kotlin/plugin/k2:kotlin.plugin.k2[module, test]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/plugins/kotlin/refactorings/kotlin.refactorings.introduce.k2[module]",
        "//intellij-community/plugins/kotlin/frontend-independent/tests:kotlin.fir.frontend-independent.tests[module, test]",
    ],
)
