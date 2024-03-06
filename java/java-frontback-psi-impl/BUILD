load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.frontback.psi.impl",
    # do not sort: must match IML order
    srcs = [
        "gen",
        "src",
    ],
    iml_files = ["intellij.java.frontback.psi.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/java/java-frontback-psi-api:intellij.java.frontback.psi",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-frontback-psi-api:intellij.java.frontback.psi[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community:ASM",
        "//intellij-community:StreamEx",
        "//intellij-community:fastutil-min",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-serialization-core",
    ],
)
