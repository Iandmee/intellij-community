load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.ant.jps",
    srcs = ["src"],
    iml_files = ["intellij.ant.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.ant.jps.tests",
    iml_files = ["intellij.ant.jps.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/ant/jps-plugin:intellij.ant.jps[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization.tests[module, test]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build.tests[module, test]",
    ],
)
