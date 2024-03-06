load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.langInjection.tests",
    iml_files = ["intellij.platform.langInjection.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/java/testFramework:intellij.java.testFramework[module]",
        "//intellij-community/plugins/IntelliLang:intellij.platform.langInjection[module]",
        "//intellij-community/plugins/IntelliLang:intellij.xml.langInjection[module]",
        "//intellij-community/xml/impl:intellij.xml.impl[module]",
        "//intellij-community/plugins/yaml:intellij.yaml[module]",
        "//intellij-community/plugins/IntelliLang:intellij.java.langInjection[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
        "//intellij-community:assertJ",
        "//intellij-community/plugins/IntelliLang/intellilang-jps-plugin:intellij.java.langInjection.jps[module]",
        "//intellij-community:ASM",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module, test]",
    ],
)
