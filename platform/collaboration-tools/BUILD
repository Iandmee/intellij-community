load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.collaborationTools",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.platform.collaborationTools.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/vcs-log/impl:intellij.platform.vcs.log.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community:miglayout-swing",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/diff-api:intellij.platform.diff[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/credential-store-ui:intellij.platform.credentialStore.ui[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:mockito[test]",
        "//intellij-community:mockito.kotlin[test]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
        "//intellij-community/platform/vcs-log/api:intellij.platform.vcs.log[module]",
        "//intellij-community:caffeine",
        "//intellij-community/platform/collaboration-tools/auth:intellij.platform.collaborationTools.auth[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jetbrains.markdown",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:kotlinx-coroutines-test[test]",
        "//intellij-community/platform/dvcs-impl:intellij.platform.vcs.dvcs.impl[module]",
    ],
)
