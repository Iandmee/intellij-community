load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java",
    srcs = ["src"],
    iml_files = ["intellij.java.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    # do not sort: must match IML order
    resources = [
        "resources",
        "compatibilityResources",
    ],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/util:intellij.platform.util",
        "//intellij-community/platform/extensions:intellij.platform.extensions",
        "//intellij-community/xml/openapi:intellij.xml",
        "//intellij-community/platform/platform-api:intellij.platform.ide",
        "//intellij-community/platform/lang-api:intellij.platform.lang",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs",
        "//intellij-community/resources-en:intellij.java.resources.en",
        "//intellij-community/java/java-psi-api:intellij.java.psi",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing",
        "//intellij-community/java/java-analysis-api:intellij.java.analysis",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/forms_rt:intellij.java.guiForms.rt[module]",
        "//intellij-community/platform/extensions:intellij.platform.extensions[module]",
        "//intellij-community/platform/icons:intellij.platform.icons[module]",
        "//intellij-community/xml/openapi:intellij.xml[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/xml/dom-openapi:intellij.xml.dom[module]",
        "//intellij-community/resources-en:intellij.java.resources.en[module]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/java/java-analysis-api:intellij.java.analysis[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
    ],
)
