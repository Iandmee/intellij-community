load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.groovy.rt",
    srcs = ["src"],
    iml_files = ["intellij.groovy.rt.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "7",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community/plugins/groovy/rt-constants:intellij.groovy.constants.rt",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community:jetbrains-annotations-java5",
        "//intellij-community/plugins/groovy/rt-constants:intellij.groovy.constants.rt[module]",
    ],
)
