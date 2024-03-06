load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.jps",
    srcs = ["src"],
    iml_files = ["intellij.gradle.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:Ant"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community:Gradle",
        "//intellij-community:Ant",
        "//intellij-community:gson",
        "//intellij-community/plugins/groovy/jps-plugin:intellij.groovy.jps[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build.tests[module, test]",
    ],
)
