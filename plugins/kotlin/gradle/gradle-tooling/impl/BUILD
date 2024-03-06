load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.gradle.gradle-tooling.impl",
    srcs = ["src"],
    iml_files = ["kotlin.gradle.gradle-tooling.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect",
        "//intellij-community:kotlin-tooling-core",
        "//intellij-community:kotlin-gradle-plugin-idea-proto",
        "//intellij-community:kotlin-gradle-plugin-idea",
        "//intellij-community/plugins/kotlin/gradle/gradle-tooling:kotlin.gradle.gradle-tooling[module]",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/base/project-model:kotlin.base.project-model[module]",
        "//intellij-community/plugins/gradle/tooling-extension-api:intellij.gradle.toolingExtension[module]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlin-test-junit[test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
    ],
)
