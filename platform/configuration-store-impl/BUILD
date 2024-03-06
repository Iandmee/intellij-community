load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.configurationStore.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.configurationStore.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "com.intellij.configurationStore"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer[module]",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module]",
        "//intellij-community:snakeyaml-engine",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:aalto-xml",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:hash4j",
        "//intellij-community:opentelemetry",
        "//intellij-community/platform/diagnostic/telemetry:intellij.platform.diagnostic.telemetry[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.configurationStore.tests",
    iml_files = ["intellij.platform.configurationStore.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"testSrc": "com.intellij.configurationStore"},
    test_friends = ["//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.impl"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.impl[module, test]",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer[module, test]",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module, test]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module, test]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
    ],
)
