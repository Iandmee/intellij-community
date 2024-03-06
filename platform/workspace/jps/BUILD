load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.workspace.jps",
    # do not sort: must match IML order
    srcs = [
        "gen",
        "src",
    ],
    iml_files = ["intellij.platform.workspace.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:Kryo5",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:opentelemetry",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
    ],
)
