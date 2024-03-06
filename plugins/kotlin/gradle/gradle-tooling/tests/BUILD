load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.gradle.gradle-tooling.tests",
    iml_files = ["kotlin.gradle.gradle-tooling.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin.project.model[test]",
        "//intellij-community:kotlin-test",
        "//intellij-community:JUnit4",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module]",
        "//intellij-community/plugins/kotlin/base/project-model:kotlin.base.project-model[module]",
        "//intellij-community/plugins/kotlin/gradle/gradle-tooling:kotlin.gradle.gradle-tooling[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module]",
        "//intellij-community/plugins/kotlin/gradle/gradle-tooling/impl:kotlin.gradle.gradle-tooling.impl[module]",
        "//intellij-community/plugins/gradle/tooling-extension-impl:intellij.gradle.toolingExtension.impl[module]",
        "//intellij-community:Gradle[test]",
        "//intellij-community:kotlin-tooling-core",
    ],
)
