load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.util.compiler-classpath",
    srcs = ["src"],
    iml_files = ["kotlin.util.compiler-classpath.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:ASM",
        "//intellij-community:Java_Compatibility",
        "//intellij-community:javax-inject",
        "//intellij-community:javaslang",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jna",
        "//intellij-community:lz4-java",
        "//intellij-community:jsr305",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
    ],
)
