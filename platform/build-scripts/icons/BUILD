load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.images.build",
    srcs = ["src"],
    iml_files = ["intellij.platform.images.build.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    test_srcs = ["tests"],
    visibility = ["//visibility:public"],
    runtime_deps = ["//intellij-community:commons-imaging"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/jps/model-api:intellij.platform.jps.model[module]",
        "//intellij-community/jps/model-impl:intellij.platform.jps.model.impl[module]",
        "//intellij-community/platform/util:intellij.platform.util.ui[module]",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community/platform/util/diff:intellij.platform.util.diff[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community/jps/model-serialization:intellij.platform.jps.model.serialization[module]",
        "//intellij-community/platform/build-scripts/downloader:intellij.platform.buildScripts.downloader[module]",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:JUnit4[test]",
        "//intellij-community:opentelemetry",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community:okhttp",
        "//intellij-community/build/tasks:intellij.idea.community.build.tasks[module]",
        "//intellij-community/platform/util/immutable-key-value-store:intellij.platform.util.immutableKeyValueStore[module]",
        "//intellij-community/platform/util/rt-java8:intellij.platform.util.rt.java8[module]",
        "//intellij-community:gson",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module]",
        "//m2:pngencoder",
        "//intellij-community:hash4j",
    ],
)
