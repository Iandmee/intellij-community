load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.jshell.frontend",
    srcs = ["src"],
    exclude = ["src/com/intellij/execution/jshell/frontend/Main.java"],
    iml_files = ["intellij.java.jshell.frontend.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "9",
    visibility = ["//visibility:public"],
    deps = ["//intellij-community/java/execution/jshell-protocol:intellij.java.jshell.protocol[module]"],
)
