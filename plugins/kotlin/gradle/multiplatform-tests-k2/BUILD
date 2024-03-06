load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.kotlin.gradle.multiplatform-tests-k2",
    iml_files = ["intellij.kotlin.gradle.multiplatform-tests-k2.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlinc.kotlin-jps-common",
        "//intellij-community/plugins/kotlin/plugin/k2:kotlin.plugin.k2[module, test]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module]",
        "//intellij-community/plugins/kotlin/base/facet:kotlin.base.facet[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module, test]",
        "//intellij-community/plugins/gradle/java:intellij.gradle.java[module]",
        "//intellij-community/plugins/gradle:intellij.gradle.tests[module, test]",
        "//intellij-community/plugins/kotlin/gradle/gradle-tooling/impl:kotlin.gradle.gradle-tooling.impl[module]",
        "//intellij-community/plugins/kotlin/gradle/gradle:kotlin.gradle.gradle[module]",
        "//intellij-community/plugins/kotlin/gradle/gradle-java/tests:kotlin.gradle.gradle-java.tests[module]",
        "//intellij-community/android/android:intellij.android.core[module, test]",
        "//intellij-community:kotlinc.kotlin-compiler-common",
        "//intellij-community:kotlin-tooling-core",
        "//intellij-community:kotlin-test[test]",
        "//intellij-community:kotlin-test-junit[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community/plugins/gradle/java:intellij.gradle.java.tests[module, test]",
    ],
)
