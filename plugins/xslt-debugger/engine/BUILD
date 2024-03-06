load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.xslt.debugger.rt",
    srcs = ["src"],
    iml_files = ["intellij.xslt.debugger.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/xpath/xslt-rt:intellij.xpath.rt[module]",
        "//intellij-community/plugins/xslt-debugger/engine:RMI_Stubs",
    ],
)

load("//tools/base/bazel:jvm_import.bzl", "jvm_import")

# managed by go/iml_to_build
jvm_import(
    name = "RMI_Stubs",
    jars = ["lib/rmi-stubs.jar"],
    visibility = ["//visibility:public"],
)
