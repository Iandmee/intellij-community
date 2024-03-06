load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.kotlin.onboarding-promoter",
    srcs = ["src"],
    iml_files = ["intellij.kotlin.onboarding-promoter.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/plugins/ide-features-trainer:intellij.featuresTrainer[module]",
        "//intellij-community/java/java-features-trainer:intellij.java.featuresTrainer[module]",
        "//intellij-community/plugins/kotlin/features-trainer:kotlin.features-trainer[module]",
    ],
)
