load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.run-configurations.testng",
    srcs = ["src"],
    iml_files = ["kotlin.run-configurations.testng.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/facet:kotlin.base.facet[module]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/run-configurations/jvm:kotlin.run-configurations.jvm[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module]",
        "//intellij-community/plugins/testng:intellij.testng[module]",
    ],
)
