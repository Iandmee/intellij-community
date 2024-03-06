load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.grazie.json",
    srcs = ["src/main/kotlin"],
    iml_files = ["intellij.grazie.json.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/grazie/src:intellij.grazie.core[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/json:intellij.json[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
    ],
)
