load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.workspace.storage",
    # do not sort: must match IML order
    srcs = [
        "gen",
        "src",
    ],
    iml_files = ["intellij.platform.workspace.storage.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:Guava",
        "//intellij-community:kotlin-reflect",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:fastutil-min",
        "//intellij-community:caffeine",
        "//intellij-community:Kryo5",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community:opentelemetry",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
        "//intellij-community:kotlinx-collections-immutable",
    ],
)
