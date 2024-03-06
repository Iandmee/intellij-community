load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.buildScripts.downloader",
    srcs = ["src"],
    iml_files = ["intellij.platform.buildScripts.downloader.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:commons-compress",
        "//intellij-community:tcServiceMessages",
        "//intellij-community:Guava",
        "//intellij-community:zstd-jni",
        "//intellij-community:zstd-jni-windows-aarch64",
        "//intellij-community:commons-io",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:ktor-client-auth",
        "//intellij-community:ktor-client-cio",
        "//intellij-community:ktor-client-encoding",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:opentelemetry",
        "//intellij-community:opentelemetry-extension-kotlin",
    ],
)
