load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.jps",
    srcs = ["src"],
    iml_files = ["intellij.devkit.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
        "//intellij-community:ASM",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.jps.tests",
    iml_files = ["intellij.devkit.jps.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/devkit/jps-plugin:intellij.devkit.jps[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build.tests[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization.tests[module, test]",
        "//intellij-community:ASM[test]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module, test]",
    ],
)
