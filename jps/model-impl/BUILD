load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.model.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.jps.model.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community:fastutil-min",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.model.tests",
    iml_files = ["intellij.platform.jps.model.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/testFramework:intellij.platform.testFramework"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
    ],
)
