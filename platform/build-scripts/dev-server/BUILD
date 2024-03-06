load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.devBuildServer",
    srcs = ["src"],
    iml_files = ["intellij.platform.devBuildServer.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.intellij.build.devServer"},
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community:xz"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/build-scripts:intellij.platform.buildScripts[module]",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community/build/tasks:intellij.idea.community.build.tasks[module]",
        "//intellij-community:slf4j-api",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module]",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/util/rt-java8:intellij.platform.util.rt.java8[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community:hash4j",
    ],
)
