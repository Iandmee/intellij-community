load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.textmate.core",
    srcs = ["src"],
    iml_files = ["intellij.textmate.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:joni",
        "//intellij-community:caffeine",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit4[test]",
        "//intellij-community:joni",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:fastutil-min",
        "//intellij-community:caffeine",
        "//intellij-community/platform/util/base:intellij.platform.util.base[module]",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:kotlin-reflect",
    ],
)
