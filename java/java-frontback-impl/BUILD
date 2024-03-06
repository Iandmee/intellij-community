load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.frontback.impl",
    srcs = ["src"],
    iml_files = ["intellij.java.frontback.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resource"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/java/java-frontback-psi-api:intellij.java.frontback.psi",
        "//intellij-community/java/java-frontback-psi-impl:intellij.java.frontback.psi.impl",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl",
        "//intellij-community/xml/xml-frontback:intellij.xml.frontback",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/java-frontback-psi-api:intellij.java.frontback.psi[module]",
        "//intellij-community/java/java-frontback-psi-impl:intellij.java.frontback.psi.impl[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/xml/xml-frontback:intellij.xml.frontback[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
    ],
)
