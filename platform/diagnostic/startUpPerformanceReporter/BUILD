load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.diagnostic.startUpPerformanceReporter",
    srcs = ["src"],
    iml_files = ["intellij.platform.diagnostic.startUpPerformanceReporter.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij.platform.diagnostic.startUpPerformanceReporter"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jackson",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-protobuf",
        "//intellij-community/platform/util/http:intellij.platform.util.http[module]",
        "//intellij-community/platform/diagnostic/telemetry-impl:intellij.platform.diagnostic.telemetry.impl[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
