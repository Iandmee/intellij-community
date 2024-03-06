load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.analysis.impl",
    srcs = ["src"],
    iml_files = ["intellij.java.analysis.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl",
        "//intellij-community/java/java-indexing-impl:intellij.java.indexing.impl",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl",
        "//intellij-community/java/java-analysis-api:intellij.java.analysis",
        "//intellij-community/java/java-frontback-impl:intellij.java.frontback.impl",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/analysis-impl:intellij.platform.analysis.impl[module]",
        "//intellij-community/java/java-indexing-impl:intellij.java.indexing.impl[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/java/java-analysis-api:intellij.java.analysis[module]",
        "//intellij-community/resources-en:intellij.java.resources.en[module]",
        "//intellij-community/xml/xml-psi-impl:intellij.xml.psi.impl[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community:ASM",
        "//intellij-community:StreamEx",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
        "//intellij-community:icu4j",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
        "//intellij-community/java/java-frontback-impl:intellij.java.frontback.impl[module]",
    ],
)
