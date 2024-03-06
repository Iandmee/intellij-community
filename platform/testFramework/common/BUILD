load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.testFramework.common",
    srcs = ["src"],
    iml_files = ["intellij.platform.testFramework.common.iml"],
    javacopts_from_jps = [
        "-Xlint:unchecked",
        "--add-exports",
        "java.desktop/sun.awt=ALL-UNNAMED",
    ],
    package_prefixes = {"src": "com.intellij.testFramework"},
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jbr-api",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/platform-util-netty:intellij.platform.ide.util.netty[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/testFramework/core:intellij.platform.testFramework.core[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
    ],
)
