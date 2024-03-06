load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.extensions",
    srcs = ["src"],
    iml_files = ["intellij.platform.extensions.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:kotlinx-coroutines-core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:fastutil-min",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
