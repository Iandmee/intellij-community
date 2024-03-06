load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.guiForms.jps",
    srcs = ["src"],
    iml_files = ["intellij.java.guiForms.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module, test]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
        "//intellij-community/java/compiler/forms-compiler:intellij.java.guiForms.compiler[module]",
        "//intellij-community/platform/forms_rt:intellij.java.guiForms.rt[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization.tests[module, test]",
        "//intellij-community:Java_Compatibility[test]",
        "//intellij-community:ASM",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build.tests[module, test]",
    ],
)
