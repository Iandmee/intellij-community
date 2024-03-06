load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.execution.impl",
    srcs = ["src"],
    iml_files = ["intellij.platform.execution.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/platform/macro:intellij.platform.macro"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/lang-api:intellij.platform.lang[module]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/macro:intellij.platform.macro[module]",
        "//intellij-community:miglayout-swing",
        "//intellij-community:Guava",
        "//intellij-community:StreamEx",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community:jediterm-core",
        "//intellij-community:jediterm-ui",
        "//intellij-community:pty4j",
        "//intellij-community/platform/execution:intellij.platform.execution[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/platform/wsl-impl:intellij.platform.wsl.impl[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/workspace/storage:intellij.platform.workspace.storage[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jna",
        "//intellij-community:hash4j",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
        "//intellij-community/platform/ijent:intellij.platform.ijent[module]",
        "//intellij-community:rd-core",
        "//intellij-community/platform/rd-platform-community:intellij.platform.rd.community[module]",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.execution.tests",
    iml_files = ["intellij.platform.execution.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/platform-util-io:intellij.platform.ide.util.io[module, test]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module, test]",
        "//intellij-community:assertJ[test]",
    ],
)
