load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.build",
    # do not sort: must match IML order
    srcs = [
        "src",
        "gen",
    ],
    iml_files = ["intellij.platform.jps.build.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/platform/util:intellij.platform.util",
        "//intellij-community/jps/jps-builders-6:intellij.platform.jps.build.javac.rt",
        "//intellij-community/platform/tracing:intellij.platform.tracing.rt",
    ],
    # do not sort: must match IML order
    runtime_deps = [
        "//intellij-community/java/compiler/instrumentation-util-8:intellij.java.compiler.instrumentationUtil.java8",
        "//intellij-community/java/java-runtime:intellij.java.rt",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/forms_rt:intellij.java.guiForms.rt[module]",
        "//intellij-community/java/compiler/forms-compiler:intellij.java.guiForms.compiler[module]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module]",
        "//intellij-community/aether-dependency-resolver:intellij.java.aetherDependencyResolver[module]",
        "//intellij-community:ASM",
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community/platform/util/nanoxml:intellij.platform.util.nanoxml[module]",
        "//intellij-community:jgoodies-forms",
        "//intellij-community:protobuf",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module]",
        "//intellij-community:netty-codec-http",
        "//intellij-community:javax.annotation-api",
        "//m2:qdox-java-parser",
        "//intellij-community:gson",
        "//intellij-community:fastutil-min",
        "//intellij-community:jps-javac-extension",
        "//intellij-community:netty-buffer",
        "//intellij-community/jps/jps-builders-6:intellij.platform.jps.build.javac.rt[module]",
        "//intellij-community/platform/tracing:intellij.platform.tracing.rt[module]",
        "//intellij-community/platform/runtime/repository:intellij.platform.runtime.repository[module]",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module]",
        "//intellij-community:caffeine",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.jps.build.tests",
    iml_files = ["intellij.platform.jps.build.tests.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    exports = ["//intellij-community/jps/jps-builders:intellij.platform.jps.build"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization.tests[module, test]",
        "//intellij-community/java/compiler/instrumentation-util:intellij.java.compiler.instrumentationUtil[module, test]",
        "//intellij-community:Eclipse[test]",
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:ASM[test]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module, test]",
        "//intellij-community:fastutil-min[test]",
        "//intellij-community:gson[test]",
    ],
)
