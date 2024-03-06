load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.project-model",
    srcs = ["src"],
    iml_files = ["kotlin.base.project-model.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    exports = ["//intellij-community:kotlin-tooling-core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community:kotlin-gradle-plugin-idea",
        "//intellij-community:kotlin-tooling-core",
    ],
)
