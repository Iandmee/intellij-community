load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.gradle.analysis",
    srcs = ["src"],
    iml_files = ["intellij.gradle.analysis.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/android/gradle-dsl:intellij.android.gradle.dsl[module]",
        "//intellij-community/android/gradle-dsl-toml:intellij.android.gradle.dsl.toml[module]",
        "//intellij-community/plugins/gradle/java:intellij.gradle.java[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
    ],
)
