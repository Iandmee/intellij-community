load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.credentialStore",
    srcs = ["src"],
    iml_files = ["intellij.platform.credentialStore.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {
        "test": "com.intellij.credentialStore",
        "src": "com.intellij.credentialStore",
    },
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/ide-core:intellij.platform.ide.core[module]",
        "//intellij-community:jna",
        "//intellij-community/platform/ide-core-impl:intellij.platform.ide.core.impl[module]",
        "//intellij-community:assertJ[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:Guava",
        "//intellij-community:bouncy-castle-provider",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community:snakeyaml",
        "//intellij-community:fastutil-min",
        "//m2:dbus-java",
        "//intellij-community:caffeine",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/remote-core:intellij.platform.remote.core[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:kotlinx-coroutines-core",
    ],
)
