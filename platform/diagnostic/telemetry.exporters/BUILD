load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.diagnostic.telemetry.exporters",
    srcs = ["src"],
    iml_files = ["intellij.platform.diagnostic.telemetry.exporters.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    package_prefixes = {"src": "com.intellij.platform.diagnostic.telemetry.exporters"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community:opentelemetry-exporter-otlp-common",
        "//intellij-community/platform/util/http:intellij.platform.util.http[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:jackson",
    ],
)
