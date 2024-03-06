load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.objectSerializer.annotations",
    srcs = ["annotations"],
    iml_files = ["intellij.platform.objectSerializer.annotations.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    package_prefixes = {"annotations": "com.intellij.serialization"},
    visibility = ["//visibility:public"],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.objectSerializer",
    srcs = ["src"],
    iml_files = ["intellij.platform.objectSerializer.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {
        "src": "com.intellij.serialization",
        "testInternalSrc": "com.intellij.serialization",
    },
    test_srcs = ["testInternalSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:ion",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:kotlin-reflect",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer.annotations[module]",
        "//intellij-community:lz4-java",
        "//intellij-community:assertJ[test]",
        "//intellij-community:fastutil-min",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.objectSerializer.tests",
    iml_files = ["intellij.platform.objectSerializer.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"testSrc": "com.intellij.serialization"},
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer[module, test]",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer.annotations[module, test]",
        "//intellij-community:ion",
        "//intellij-community:fastutil-min",
    ],
)
