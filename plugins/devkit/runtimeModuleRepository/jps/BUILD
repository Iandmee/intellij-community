load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.devkit.runtimeModuleRepository.jps",
    srcs = ["src"],
    iml_files = ["intellij.devkit.runtimeModuleRepository.jps.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    package_prefixes = {
        "testSrc": "com.intellij.devkit.runtimeModuleRepository.jps",
        "src": "com.intellij.devkit.runtimeModuleRepository.jps",
    },
    resources = ["resources"],
    test_srcs = ["testSrc"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/platform/runtime/repository:intellij.platform.runtime.repository[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/testFramework:intellij.platform.testFramework[module, test]",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build.tests[module, test]",
    ],
)
