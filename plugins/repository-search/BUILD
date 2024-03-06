load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.repository.search",
    # do not sort: must match IML order
    srcs = [
        "src/main/java",
        "src/main/kotlin",
    ],
    iml_files = ["intellij.repository.search.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    test_resources = ["src/test/resources"],
    test_srcs = ["src/test/kotlin"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:kotlinx-serialization-core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/plugins/maven-model:intellij.maven.model[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community:gson",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community:package-search-api-models",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community:ktor-serialization-kotlinx-json",
        "//intellij-community:ktor-client-content-negotiation",
        "//intellij-community:ktor-client-logging",
        "//intellij-community:ktor-client-cio",
        "//intellij-community:kotlinx-coroutines-slf4j",
        "//intellij-community:ktor-client-mock[test]",
        "//intellij-community:kotlinx-coroutines-test[test]",
    ],
)
