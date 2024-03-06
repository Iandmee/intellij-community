load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.idea.community.build",
    srcs = ["src"],
    iml_files = ["intellij.idea.community.build.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/build-scripts:intellij.platform.buildScripts"],
    runtime_deps = ["//intellij-community:test-discovery-plugin-base"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/build-scripts:intellij.platform.buildScripts[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/build/deps:intellij.idea.community.build.dependencies[module]",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community/build/tasks:intellij.idea.community.build.tasks[module]",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module]",
    ],
)
