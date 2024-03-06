load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tasks.core",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.tasks.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/plugins/tasks/tasks-api:intellij.tasks",
        "//intellij-community/platform/platform-api:intellij.platform.ide",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl",
        "//intellij-community/plugins/tasks/tasks-core:axis-1.4",
        "//intellij-community:gson",
        "//intellij-community/xml/impl:intellij.xml.impl",
        "//intellij-community/platform/core-api:intellij.platform.core",
        "//intellij-community/platform/tasks-platform-impl:intellij.platform.tasks.impl",
        "//intellij-community/platform/tasks-platform-api:intellij.platform.tasks",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/plugins/tasks/tasks-api:intellij.tasks[module]",
        "//intellij-community/platform/platform-api:intellij.platform.ide[module]",
        "//intellij-community/platform/platform-impl:intellij.platform.ide.impl[module]",
        "//intellij-community/platform/vcs-api:intellij.platform.vcs[module]",
        "//intellij-community/platform/lang-impl:intellij.platform.lang.impl[module]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module]",
        "//intellij-community/plugins/tasks/tasks-core:axis-1.4",
        "//intellij-community:XmlRPC",
        "//intellij-community:gson",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community/RegExpSupport:intellij.regexp[module]",
        "//intellij-community/platform/xdebugger-api:intellij.platform.debugger[module]",
        "//intellij-community/platform/xdebugger-impl:intellij.platform.debugger.impl[module]",
        "//intellij-community:http-client",
        "//intellij-community/platform/tasks-platform-impl:intellij.platform.tasks.impl[module]",
        "//intellij-community/platform/tasks-platform-api:intellij.platform.tasks[module]",
        "//intellij-community/plugins/tasks/tasks-compatibility:intellij.tasks.compatibility[module]",
        "//m2:commons-discovery",
        "//intellij-community:javax.annotation-api",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community:jsonpath",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/markdown-utils:intellij.platform.markdown.utils[module]",
    ],
)

load("//tools/base/bazel:jvm_import.bzl", "jvm_import")

# managed by go/iml_to_build
jvm_import(
    name = "axis-1.4",
    # do not sort: must match IML order
    jars = [
        "lib/axis-1.4.jar",
        "lib/axis-jaxrpc-1.4.jar",
        "lib/wsdl4j-1.4.jar",
        "lib/axis-saaj-1.3.jar",
    ],
    visibility = ["//visibility:public"],
)
