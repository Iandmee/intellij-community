load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.cucumber.jvmFormatter",
    srcs = ["src"],
    iml_files = ["intellij.cucumber.jvmFormatter.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:cucumber-core",
        "//intellij-community:cucumber-core_2.0.1",
        "//intellij-community/plugins/junit_rt:intellij.junit.rt[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community:JUnit4",
    ],
)
