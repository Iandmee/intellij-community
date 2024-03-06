load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.toolingExtension",
    srcs = ["src"],
    iml_files = ["intellij.gradle.toolingExtension.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:Gradle",
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community:org.codehaus.groovy_groovy-ant",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/external-system-rt:intellij.platform.externalSystem.rt[module]",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community:Gradle",
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community:org.codehaus.groovy_groovy-ant",
    ],
)
