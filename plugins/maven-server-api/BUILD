load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.maven.server",
    srcs = ["src/main/java"],
    iml_files = ["intellij.maven.server.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt",
        "//intellij-community/plugins/maven-model:intellij.maven.model",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/plugins/maven-model:intellij.maven.model[module]",
    ],
)
