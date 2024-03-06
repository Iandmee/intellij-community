load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.core.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.core.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community:kotlin-stdlib",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community:aalto-xml",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community:automaton",
        "//intellij-community:Guava",
        "//intellij-community/platform/util/diff:intellij.platform.util.diff[module]",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
