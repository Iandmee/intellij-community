load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.featuresTrainer",
    srcs = ["src"],
    iml_files = ["intellij.featuresTrainer.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["res"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:assertJ",
        "//intellij-community:assertj-swing",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:Guava",
        "//intellij-community:assertJ",
        "//intellij-community:assertj-swing",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/execution-impl:intellij.platform.execution.impl[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/diff-impl:intellij.platform.diff.impl[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/tasks-platform-impl:intellij.platform.tasks.impl[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/xml/xml-psi-api:intellij.xml.psi[module]",
        "//intellij-community/platform/feedback:intellij.platform.feedback[module]",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-json",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/lvcs-impl:intellij.platform.lvcs.impl[module]",
        "//intellij-community/platform/tips-of-the-day:intellij.platform.tips[module]",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
