load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.core",
    srcs = ["src"],
    iml_files = ["intellij.platform.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/util:intellij.platform.util",
        "//intellij-community/platform/extensions:intellij.platform.extensions",
        "//intellij-community/platform/util/progress:intellij.platform.util.progress",
        "//intellij-community:kotlinx-collections-immutable",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/util/progress:intellij.platform.util.progress[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
        "//intellij-community:kotlinx-collections-immutable",
    ],
)
