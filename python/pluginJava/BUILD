load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.python.community.plugin.java",
    iml_files = ["intellij.python.community.plugin.java.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/python/python-psi-api:intellij.python.psi[module]",
        "//intellij-community/python:intellij.python.community.impl[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/python/pluginCore/impl:intellij.python.community.plugin.impl[module]",
        "//intellij-community/python/python-psi-impl:intellij.python.psi.impl[module]",
        "//intellij-community/platform/inspect:intellij.platform.inspect[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/python/python-core-impl:intellij.python.community.core.impl[module]",
    ],
)
