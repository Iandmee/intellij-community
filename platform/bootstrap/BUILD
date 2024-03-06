load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.bootstrap",
    srcs = ["src"],
    iml_files = ["intellij.platform.bootstrap.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community:jbr-api",
        "//intellij-community/platform/runtime/repository:intellij.platform.runtime.repository[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
        "//intellij-community/platform/diagnostic/telemetry-impl:intellij.platform.diagnostic.telemetry.impl[module]",
        "//intellij-community:kotlinx-coroutines-debug",
    ],
)
