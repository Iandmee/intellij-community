load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.gradle.code-insight-groovy",
    srcs = ["src"],
    iml_files = ["kotlin.gradle.code-insight-groovy.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/platforms:kotlin.base.platforms[module]",
        "//intellij-community/plugins/kotlin/base/facet:kotlin.base.facet[module]",
        "//intellij-community/plugins/kotlin/base/project-structure:kotlin.base.project-structure[module]",
        "//intellij-community/plugins/kotlin/base/external-build-system:kotlin.base.external-build-system[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/base/code-insight:kotlin.base.code-insight[module]",
        "//intellij-community/plugins/kotlin/project-configuration:kotlin.project-configuration[module]",
        "//intellij-community/plugins/kotlin/migration:kotlin.migration[module]",
        "//intellij-community/plugins/kotlin/inspections:kotlin.inspections[module]",
        "//intellij-community/plugins/kotlin/gradle/gradle:kotlin.gradle.gradle[module]",
        "//intellij-community/plugins/kotlin/gradle/code-insight-common:kotlin.gradle.code-insight-common[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/plugins/groovy/groovy-psi:intellij.groovy.psi[module]",
        "//intellij-community/plugins/kotlin/project-wizard/core:kotlin.project-wizard.core[module]",
    ],
)
