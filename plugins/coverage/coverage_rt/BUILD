load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.coverage.rt",
    srcs = ["src"],
    iml_files = ["intellij.java.coverage.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    package_prefixes = {"src": "com.intellij.coverage"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/testng_rt:intellij.testng.rt[module]",
        "//intellij-community:TestNG",
        "//intellij-community:intellij-coverage",
        "//intellij-community:intellij-test-discovery",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
    ],
)
