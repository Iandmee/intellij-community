load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.remoteServers.impl",
    srcs = ["src"],
    iml_files = ["intellij.java.remoteServers.impl.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/remote-servers/api:intellij.java.remoteServers[module]",
        "//intellij-community/java/compiler/impl:intellij.java.compiler.impl[module]",
        "//intellij-community/java/debugger/impl:intellij.java.debugger.impl[module]",
        "//intellij-community/java/execution/openapi:intellij.java.execution[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/remote-servers/impl:intellij.platform.remoteServers.impl[module]",
        "//intellij-community/java/java-impl:intellij.java.impl[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/platform-util-io-impl:intellij.platform.ide.util.io.impl[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
    ],
)
