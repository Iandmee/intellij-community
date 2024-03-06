load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.idea.community.build.tasks",
    srcs = ["src"],
    iml_files = ["intellij.idea.community.build.tasks.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community:bouncy-castle-provider",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module]",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:fastutil-min",
        "//intellij-community:opentelemetry",
        "//intellij-community:jackson-jr-objects",
        "//intellij-community:jackson",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/util/immutable-key-value-store:intellij.platform.util.immutableKeyValueStore[module]",
        "//intellij-community/platform/util/rt-java8:intellij.platform.util.rt.java8[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community/platform/diagnostic/telemetry.exporters:intellij.platform.diagnostic.telemetry.exporters[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:memoryfilesystem[test]",
        "//intellij-community:JUnit5[test]",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module]",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util/base:intellij.platform.util.base[module]",
        "//intellij-community:hash4j",
    ],
)
