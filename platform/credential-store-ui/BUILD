load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.credentialStore.ui",
    srcs = ["src"],
    iml_files = ["intellij.platform.credentialStore.ui.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij.credentialStore"},
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/credential-store:intellij.platform.credentialStore"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/credential-store:intellij.platform.credentialStore[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
