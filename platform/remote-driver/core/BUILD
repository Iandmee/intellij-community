load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.driver.impl",
    srcs = ["src"],
    iml_files = ["intellij.driver.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/remote-driver/model:intellij.driver.model"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/remote-driver/model:intellij.driver.model[module]",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community:commons-lang3",
    ],
)
