load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "kotlin.scripting-support",
    iml_files = ["kotlin.scripting-support.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["test"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community/platform/core-api:intellij.platform.core"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlin-reflect[test]",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:kotlinc.kotlin-compiler-common[test]",
        "//intellij-community:kotlinc.kotlin-compiler-tests[test]",
        "//intellij-community:kotlinc.kotlin-scripting-compiler-impl[test]",
        "//intellij-community:kotlinc.kotlin-script-runtime[test]",
        "//intellij-community/plugins/kotlin/base/util:kotlin.base.util[module, test]",
        "//intellij-community/plugins/kotlin/base/plugin:kotlin.base.plugin[module, test]",
        "//intellij-community/plugins/kotlin/base/scripting:kotlin.base.scripting[module]",
        "//intellij-community/plugins/kotlin/base/analysis:kotlin.base.analysis[module]",
        "//intellij-community/plugins/kotlin/highlighting/highlighting-shared:kotlin.highlighting.shared[module]",
        "//intellij-community/plugins/kotlin/plugin/k1:kotlin.plugin.k1[module, test]",
        "//intellij-community/plugins/kotlin/core:kotlin.core[module, test]",
        "//intellij-community/plugins/kotlin/frontend-independent:kotlin.fir.frontend-independent[module, test]",
        "//intellij-community/plugins/kotlin/idea/tests:kotlin.idea.tests[module, test]",
        "//intellij-community/plugins/kotlin/idea:kotlin.idea[module, test]",
        "//intellij-community/plugins/kotlin/jvm:kotlin.jvm[module, test]",
        "//intellij-community/plugins/kotlin/tests-common:kotlin.tests-common[module, test]",
        "//intellij-community/plugins/kotlin/test-framework:kotlin.test-framework[module, test]",
        "//intellij-community/platform/editor-ui-api:intellij.platform.editor[module, test]",
        "//intellij-community/platform/vcs-impl:intellij.platform.vcs.impl[module, test]",
        "//intellij-community/java/java-psi-api:intellij.java.psi[module, test]",
    ],
)
