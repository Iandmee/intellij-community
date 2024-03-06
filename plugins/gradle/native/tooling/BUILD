load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.native.tooling",
    srcs = ["src"],
    iml_files = ["intellij.gradle.native.tooling.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    package_prefixes = {"src": "org.jetbrains.plugins.gradle.nativeplatform.tooling"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension[module]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module]",
        "//intellij-community:Gradle",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer.annotations[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.native.tooling.tests",
    iml_files = ["intellij.gradle.native.tooling.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/plugins/gradle/native/tooling:intellij.gradle.native.tooling[module, test]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module, test]",
        "//intellij-community/platform/object-serializer:intellij.platform.objectSerializer[module, test]",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension[module, test]",
    ],
)
