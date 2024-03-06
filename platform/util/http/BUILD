load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.http",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.http.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    package_prefixes = {"src": "com.intellij.platform.util.http"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:ktor-client-cio",
        "//intellij-community:jetbrains-annotations",
    ],
)
