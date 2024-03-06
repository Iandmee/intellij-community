load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.util",
    srcs = ["src"],
    iml_files = ["kotlin.base.util.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlinc.kotlin-compiler-fe10",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/platform/lang-core:intellij.platform.lang.core[module]",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module]",
        "//intellij-community/platform/indexing-api:intellij.platform.indexing[module]",
        "//intellij-community/java/java-psi-impl:intellij.java.psi.impl[module]",
        "//intellij-community:kotlin-test-junit[test]",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/java/java-analysis-impl:intellij.java.analysis.impl[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
    ],
)
