load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.eclipse.common",
    srcs = ["src"],
    iml_files = ["intellij.eclipse.common.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    package_prefixes = {"src": "org.jetbrains.idea.eclipse"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
    ],
)
