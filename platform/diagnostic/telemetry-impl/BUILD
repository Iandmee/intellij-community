load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.diagnostic.telemetry.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.diagnostic.telemetry.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    package_prefixes = {"src": "com.intellij.platform.diagnostic.telemetry.impl"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jackson",
        "//intellij-community:opentelemetry",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:opentelemetry-extension-kotlin",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community:opentelemetry-exporter-otlp-common",
        "//intellij-community:HdrHistogram",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/util/http:intellij.platform.util.http[module]",
        "//intellij-community:kotlinx-serialization-protobuf",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
        "//intellij-community/platform/diagnostic/telemetry.exporters:intellij.platform.diagnostic.telemetry.exporters[module]",
    ],
)
