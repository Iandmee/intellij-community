load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.base.test",
    iml_files = ["kotlin.base.test.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/java/testFramework:intellij.java.testFramework",
        "//intellij-community/plugins/junit_rt:intellij.junit.rt",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib[test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community:kotlinc.high-level-api[test]",
        "//intellij-community:kotlinc.high-level-api-impl-base[test]",
        "//intellij-community:kotlinc.high-level-api-impl-base-tests[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:Guava[test]",
        "//intellij-community/plugins/kotlin/base/frontend-agnostic:kotlin.base.frontend-agnostic[module, test]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module, test]",
        "//intellij-community/java/testFramework:intellij.java.testFramework[module, test]",
        "//intellij-community/plugins/junit_rt:intellij.junit.rt[module, test]",
    ],
)
