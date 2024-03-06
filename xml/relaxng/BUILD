load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.relaxng",
    srcs = ["src"],
    iml_files = ["intellij.relaxng.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/xml/relaxng:rngom-20051226-patched",
        "//m2:isorelax",
        "//intellij-community/xml/relaxng:trang-core",
        "//m2:jing",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)

load("//tools/base/bazel:jvm_import.bzl", "jvm_import")

# managed by go/iml_to_build
jvm_import(
    name = "rngom-20051226-patched",
    jars = ["lib/rngom-20051226-patched.jar"],
    visibility = ["//visibility:public"],
)

# managed by go/iml_to_build
jvm_import(
    name = "trang-core",
    jars = ["lib/trang-core.jar"],
    visibility = ["//visibility:public"],
)
