load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.model.serialization",
    srcs = ["src"],
    iml_files = ["intellij.platform.jps.model.serialization.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:opentelemetry",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.model.serialization.tests",
    iml_files = ["intellij.platform.jps.model.serialization.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/jps/model-impl:intellij.platform.jps.model.tests"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.tests[module, test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
    ],
)
