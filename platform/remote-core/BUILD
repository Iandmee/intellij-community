load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.remote.core",
    srcs = ["src"],
    iml_files = ["intellij.platform.remote.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij"},
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex",
    ],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:Mac",
        "//intellij-community:Guava",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community:JUnit5[test]",
    ],
)
