load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.settingsRepository",
    srcs = ["src"],
    iml_files = ["intellij.settingsRepository.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"src": "org.jetbrains.settingsRepository"},
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//m2:jetbrains.intellij.deps.eclipse.jgit",
        "//m2:eclipse.jgit.ssh.jsch",
        "//m2:JSch",
        "//intellij-community:jzlib",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//m2:jetbrains.intellij.deps.eclipse.jgit",
        "//m2:eclipse.jgit.ssh.jsch",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//m2:JSch",
        "//intellij-community:jzlib",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:slf4j-api",
        "//intellij-community:slf4j-jdk14",
        "//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.impl[module]",
        "//intellij-community/platform/credential-store-ui:intellij.platform.credentialStore.ui[module]",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:caffeine",
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.settingsRepository.tests",
    iml_files = ["intellij.settingsRepository.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    package_prefixes = {"testSrc": "org.jetbrains.settingsRepository.test"},
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/platform/projectModel-impl:intellij.platform.projectModel.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:jna",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.impl[module]",
        "//intellij-community/platform/util/testSrc:intellij.platform.util.tests[module, test]",
        "//intellij-community/plugins/settings-repository:intellij.settingsRepository[module]",
        "//intellij-community:assertJ[test]",
        "//intellij-community/platform/credential-store-ui:intellij.platform.credentialStore.ui[module, test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community/platform/configuration-store-impl:intellij.platform.configurationStore.tests[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community:fastutil-min[test]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
    ],
)
