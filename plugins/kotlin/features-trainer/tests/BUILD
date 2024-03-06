load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.features-trainer.tests",
    iml_files = ["kotlin.features-trainer.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/ide-features-trainer:intellij.featuresTrainer[module]",
        "//intellij-community/java/java-features-trainer:intellij.java.featuresTrainer[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/projectModel-api:intellij.platform.projectModel[module]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/formatter:kotlin.formatter[module]",
        "//intellij-community/plugins/kotlin/jvm:kotlin.jvm[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module]",
        "//intellij-community/plugins/kotlin/features-trainer:kotlin.features-trainer[module, test]",
    ],
)
