load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.project-wizard.cli",
    srcs = ["src"],
    iml_files = ["kotlin.project-wizard.cli.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community:kotlinc.kotlin-compiler-common",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:snakeyaml",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/project-wizard/core:kotlin.project-wizard.core[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
