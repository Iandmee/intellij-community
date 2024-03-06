load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.workspaceModel.tests",
    iml_files = ["intellij.devkit.workspaceModel.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/plugins/devkit/intellij.devkit"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit5[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/plugins/devkit/intellij.devkit.workspaceModel[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module, test]",
        "//intellij-community/plugins/kotlin/formatter:kotlin.formatter[module, test]",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module, test]",
        "//intellij-community/platform/workspace/jps/tests:intellij.platform.workspace.jps.tests[module]",
        "//intellij-community:workspace-model-codegen",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module, test]",
        "//intellij-community/plugins/kotlin/base/facet:kotlin.base.facet[module, test]",
        "//intellij-community:kotlinc.kotlin-jps-common",
    ],
)
