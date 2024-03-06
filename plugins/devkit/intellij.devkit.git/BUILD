load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.git",
    srcs = ["src"],
    iml_files = ["intellij.devkit.git.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {
        "test": "org.jetbrains.idea.devkit.commit",
        "src": "org.jetbrains.idea.devkit.commit",
    },
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/ide-core:intellij.platform.ide.core[module]",
        "//intellij-community/platform/vcs-api/vcs-api-core:intellij.platform.vcs.core[module]",
        "//intellij-community/platform/vcs-log/api:intellij.platform.vcs.log[module]",
        "//intellij-community/platform/dvcs-impl:intellij.platform.vcs.dvcs.impl[module]",
        "//intellij-community/plugins/git4idea:intellij.vcs.git[module]",
        "//intellij-community/plugins/devkit/devkit-core:intellij.devkit.core[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
