load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.impl.refactorings",
    srcs = ["src"],
    iml_files = ["intellij.java.impl.refactorings.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/platform/core-impl:intellij.platform.core.impl[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/jsp-openapi:intellij.jsp[module]",
        "//intellij-community:StreamEx",
        "//intellij-community/platform/code-style-impl:intellij.platform.codeStyle.impl[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
    ],
)
