load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.webp",
    srcs = ["src"],
    iml_files = ["intellij.webp.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/plugins/webp:libwebp",
    ],
)

load("//tools/base/bazel:jvm_import.bzl", "jvm_import")

# managed by go/iml_to_build
jvm_import(
    name = "libwebp",
    jars = ["lib/libwebp.jar"],
    visibility = ["//visibility:public"],
)
