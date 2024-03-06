load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.workspace.jps.tests",
    iml_files = ["intellij.platform.workspace.jps.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_friends = ["//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps"],
    test_resources = ["testResources"],
    test_srcs = [
        "testSrc",
        "gen",
    ],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.tests[module]",
        "//intellij-community/platform/workspace/storage/tests:intellij.platform.workspace.storage.tests[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:commons-lang3[test]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
        "//intellij-community/platform/workspace/storage/testEntities:intellij.platform.workspace.storage.testEntities[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/testFramework/junit5:intellij.platform.testFramework.junit5[module, test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module, test]",
        "//intellij-community/tools/intellij.tools.ide.metrics.benchmark[module, test]",
    ],
)
