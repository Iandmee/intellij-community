load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.grazie.java",
    srcs = ["src/main/kotlin"],
    iml_files = ["intellij.grazie.java.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["src/main/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/plugins/grazie/src:intellij.grazie.core[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
    ],
)
