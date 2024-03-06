load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.bundled-compiler-plugins-support",
    srcs = ["src"],
    iml_files = ["kotlin.bundled-compiler-plugins-support.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community:kotlinc.allopen-compiler-plugin",
        "//intellij-community:kotlinc.kotlinx-serialization-compiler-plugin",
        "//intellij-community:kotlinc.sam-with-receiver-compiler-plugin",
        "//intellij-community:kotlinc.noarg-compiler-plugin",
        "//intellij-community:kotlinc.lombok-compiler-plugin",
        "//intellij-community:kotlinc.assignment-compiler-plugin",
        "//intellij-community:kotlinc.parcelize-compiler-plugin",
        "//intellij-community:kotlinc.scripting-compiler-plugin",
    ],
)
