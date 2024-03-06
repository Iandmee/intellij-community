load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xslt.debugger.impl.rt",
    srcs = ["src"],
    iml_files = ["intellij.xslt.debugger.impl.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/xpath/xslt-rt:intellij.xpath.rt[module]",
        "//intellij-community/plugins/xslt-debugger/engine:intellij.xslt.debugger.rt[module]",
        "//intellij-community/plugins/xslt-debugger/engine/impl:Saxon-9HE",
        "//intellij-community/plugins/xslt-debugger/engine/impl:Saxon-6.5.5",
        "//m2:Xalan-2.7.2",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:JUnit4[test]",
    ],
)

load("//tools/base/bazel:jvm_import.bzl", "jvm_import")

# managed by go/iml_to_build
jvm_import(
    name = "Saxon-9HE",
    jars = ["lib/saxon9he.jar"],
    visibility = ["//visibility:public"],
)

# managed by go/iml_to_build
jvm_import(
    name = "Saxon-6.5.5",
    jars = ["lib/saxon.jar"],
    visibility = ["//visibility:public"],
)
