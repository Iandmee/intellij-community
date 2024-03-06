load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.compiler.antTasks",
    srcs = ["src"],
    iml_files = ["intellij.java.compiler.antTasks.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/java/compiler/instrumentation-util-8:intellij.java.compiler.instrumentationUtil.java8"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:Ant",
        "//intellij-community/java/compiler/forms-compiler:intellij.java.guiForms.compiler[module]",
        "//intellij-community/platform/forms_rt:intellij.java.guiForms.rt[module]",
        "//intellij-community:ASM",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
    ],
)
