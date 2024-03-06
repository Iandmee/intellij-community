load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.java.compiler.tests",
    iml_files = ["intellij.java.compiler.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/spellchecker:intellij.spellchecker"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/compiler/impl:intellij.java.compiler.impl[module]",
        "//intellij-community/java/compiler/openapi:intellij.java.compiler[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/java/openapi:intellij.java[module]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
        "//intellij-community/java/idea-ui:intellij.java.ui[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module, test]",
        "//intellij-community/platform/testFramework/extensions:intellij.platform.testExtensions[module, test]",
        "//intellij-community/jps/jps-builders-6:intellij.platform.jps.build.javac.rt[module, test]",
        "//intellij-community/platform/core-ui:intellij.platform.core.ui[module]",
        "//intellij-community/platform/workspace/jps:intellij.platform.workspace.jps[module]",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
        "//intellij-community:kotlinx-coroutines-core[test]",
        "//intellij-community/platform/backend/workspace:intellij.platform.backend.workspace[module, test]",
    ],
)
