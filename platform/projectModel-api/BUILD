load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.projectModel",
    srcs = ["src"],
    iml_files = ["intellij.platform.projectModel.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community/jps/model-api:intellij.platform.jps.model",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/util:intellij.platform.concurrency[module]",
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
    ],
)
