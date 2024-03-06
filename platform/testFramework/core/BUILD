load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.testFramework.core",
    srcs = ["src"],
    iml_files = ["intellij.platform.testFramework.core.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/platform/boot:intellij.platform.boot[module]",
        "//intellij-community/platform/testFramework/bootstrap:intellij.tools.testsBootstrap[module]",
        "//intellij-community:JUnit4",
        "//intellij-community:JUnit5",
        "//intellij-community/java/java-runtime:intellij.java.rt[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:jackson",
        "//intellij-community:jackson-databind",
        "//intellij-community:jackson-module-kotlin",
        "//intellij-community:http-client",
    ],
)
