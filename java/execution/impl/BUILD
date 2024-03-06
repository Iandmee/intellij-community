load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.execution.impl",
    srcs = ["src"],
    iml_files = ["intellij.java.execution.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/java/execution/openapi:intellij.java.execution",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner",
        "//intellij-community/platform/statistics:intellij.platform.statistics",
    ],
    runtime_deps = ["//intellij-community/java/execution/impl:jshell-frontend"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl[module]",
        "//intellij-community/platform/testRunner:intellij.platform.testRunner[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/java-indexing-api:intellij.java.indexing[module]",
        "//intellij-community/platform/smRunner:intellij.platform.smRunner[module]",
        "//intellij-community/java/execution/jshell-protocol:intellij.java.jshell.protocol[module]",
        "//intellij-community:intellij-test-discovery",
        "//intellij-community/platform/external-system-api:intellij.platform.externalSystem[module]",
        "//intellij-community/platform/external-system-impl:intellij.platform.externalSystem.impl[module]",
        "//intellij-community:gson",
        "//intellij-community:jackson",
        "//intellij-community:miglayout-swing",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community:jackson-databind",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/statistics:intellij.platform.statistics[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)

load("//tools/base/bazel:jvm_import.bzl", "jvm_import")

# managed by go/iml_to_build
jvm_import(
    name = "jshell-frontend",
    jars = ["jshell-frontend.jar"],
    visibility = ["//visibility:public"],
)
