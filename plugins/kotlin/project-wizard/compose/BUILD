load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.project-wizard.compose",
    srcs = ["src"],
    iml_files = ["kotlin.project-wizard.compose.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_resources = ["testData"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/java/java-tests:intellij.java.tests[module, test]",
    ],
)
