load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.diagnostic.telemetry",
    srcs = ["src"],
    iml_files = ["intellij.platform.diagnostic.telemetry.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/diagnostic:intellij.platform.diagnostic"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:opentelemetry",
        "//intellij-community:opentelemetry-extension-kotlin",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
