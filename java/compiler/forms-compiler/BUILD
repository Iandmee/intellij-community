load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.guiForms.compiler",
    srcs = ["src"],
    iml_files = ["intellij.java.guiForms.compiler.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/forms_rt:intellij.java.guiForms.rt[module]",
        "//intellij-community:ASM",
        "//intellij-community:jgoodies-forms",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
        "//intellij-community/platform/util:intellij.platform.util[module, test]",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:JUnit4[test]",
    ],
)
