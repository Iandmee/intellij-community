load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.buildScripts.testFramework",
    srcs = ["src"],
    iml_files = ["intellij.platform.buildScripts.testFramework.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/build-scripts:intellij.platform.buildScripts[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:opentelemetry",
        "//intellij-community:grpc-netty-shaded",
        "//intellij-community:grpc-core",
        "//intellij-community:grpc-protobuf",
        "//intellij-community:grpc-stub",
        "//intellij-community:jackson-jr-objects",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/testFramework/core:intellij.platform.testFramework.core[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community/build/tasks:intellij.idea.community.build.tasks[module]",
        "//intellij-community:JUnit5",
        "//intellij-community:assertJ",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module]",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community/platform/reproducible-builds:intellij.platform.reproducibleBuilds.diffTool[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/plugins/devkit/runtimeModuleRepository/jps:intellij.devkit.runtimeModuleRepository.jps[module]",
        "//intellij-community/platform/runtime/repository:intellij.platform.runtime.repository[module]",
    ],
)
