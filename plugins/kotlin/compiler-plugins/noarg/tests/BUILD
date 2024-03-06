load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.compiler-plugins.noarg.tests",
    iml_files = ["kotlin.compiler-plugins.noarg.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/plugins/kotlin/gradle/gradle:kotlin.gradle.gradle",
        "//intellij-community/plugins/kotlin/uast/uast-kotlin:kotlin.uast.uast-kotlin",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.noarg-compiler-plugin",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community:JUnit4",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/facet:kotlin.base.facet[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/compiler-plugins/compiler-plugin-support/common:kotlin.compiler-plugins.compiler-plugin-support.common[module]",
        "//intellij-community/plugins/kotlin/compiler-plugins/noarg/common:kotlin.compiler-plugins.noarg.common[module]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
    ],
)
