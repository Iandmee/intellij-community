load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.build.javac.rt",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.platform.jps.build.javac.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community:jetbrains-annotations-java5",
        "//intellij-community:netty-codec-http",
        "//intellij-community:javax.annotation-api",
        "//intellij-community:jps-javac-extension",
        "//intellij-community:netty-buffer",
        "//intellij-community:protobuf",
    ],
)
