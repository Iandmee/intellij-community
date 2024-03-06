load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.javaFX.jps",
    srcs = ["src"],
    iml_files = ["intellij.javaFX.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/plugins/javaFX/common-javaFX-plugin:intellij.javaFX.common[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
