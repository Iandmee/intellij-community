load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.project-wizard.core",
    # do not sort: must match IML order
    srcs = [
        "src",
        "generated",
    ],
    iml_files = ["kotlin.project-wizard.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect",
        "//intellij-community:kotlinx-collections-immutable",
        "//intellij-community:Velocity",
        "//intellij-community:gson",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlin-test-junit[test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/resources:kotlin.base.resources[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community:slf4j-api",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/plugins/gradle:intellij.gradle.common[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
    ],
)
