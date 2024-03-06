load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.ide.customization",
    srcs = ["src"],
    iml_files = ["intellij.java.ide.customization.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl",
        "//intellij-community/platform/usageView:intellij.platform.usageView",
        "//intellij-community/java/idea-ui:intellij.java.ui",
        "//intellij-community/java/java-impl:intellij.java.impl",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner",
        "//intellij-community/notebooks/visualization:intellij.notebooks.visualization",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/plugins/ide-features-trainer:intellij.featuresTrainer[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/java/java-features-trainer:intellij.java.featuresTrainer[module]",
    ],
)
