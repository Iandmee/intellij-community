load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.serviceContainer",
    srcs = ["src"],
    iml_files = ["intellij.platform.serviceContainer.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:fastutil-min",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community/platform/instanceContainer:intellij.platform.instanceContainer[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
