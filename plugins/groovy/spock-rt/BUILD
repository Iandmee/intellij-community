load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.spock.rt",
    srcs = ["src"],
    iml_files = ["intellij.groovy.spock.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/junit_rt:intellij.junit.rt[module]",
        "//intellij-community:JUnit4",
        "//m2:spockframework.spock.core",
    ],
)
