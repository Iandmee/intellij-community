load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.jps",
    srcs = ["src"],
    iml_files = ["intellij.groovy.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/plugins/groovy/rt-constants:intellij.groovy.constants.rt[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
        "//intellij-community:Eclipse",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community:ASM",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.jps.tests",
    iml_files = ["intellij.groovy.jps.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/groovy/jps-plugin:intellij.groovy.jps[module]",
        "//intellij-community/plugins/groovy/rt-constants:intellij.groovy.constants.rt[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
    ],
)
