load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.tools.jps.build.standalone",
    srcs = ["src"],
    iml_files = ["intellij.tools.jps.build.standalone.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "11",
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:org.codehaus.groovy_groovy",
        "//intellij-community/jps/jps-builders:intellij.platform.jps.build[module]",
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community:cli-parser",
        "//intellij-community:Ant",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community:protobuf",
    ],
)
