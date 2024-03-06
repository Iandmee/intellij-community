load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.configurationScript",
    srcs = ["src"],
    iml_files = ["intellij.configurationScript.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {
        "test": "com.intellij.configurationScript",
        "src": "com.intellij.configurationScript",
    },
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/json:intellij.json[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community/plugins/yaml:intellij.yaml[module, test]",
        "//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.impl[module]",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer[module]",
        "//intellij-community:jackson[test]",
        "//intellij-community/platform/service-container:intellij.platform.serviceContainer[module]",
        "//intellij-community:snakeyaml-engine",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.configurationScript.test.java",
    iml_files = ["intellij.configurationScript.test.java.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"testJava": "com.intellij.configurationScript"},
    test_srcs = ["testJava"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/configuration-script:intellij.configurationScript[module, test]",
        "//intellij-community/java/execution/impl:intellij.java.execution.impl[module, test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:assertJ[test]",
    ],
)
