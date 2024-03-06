load("//tools/base/bazel:bazel.bzl", "iml_module")

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util",
    srcs = ["src"],
    iml_files = ["intellij.platform.util.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    jvm_target = "8",
    resources = ["resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    exports = [
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt",
        "//intellij-community/platform/util/base:intellij.platform.util.base",
    ],
    # do not sort: must match IML order
    deps = [
        "//intellij-community/platform/util/jdom:intellij.platform.util.jdom[module]",
        "//intellij-community:Log4J",
        "//intellij-community:jetbrains-annotations",
        "//intellij-community/platform/util-rt:intellij.platform.util.rt[module]",
        "//intellij-community/platform/util-class-loader:intellij.platform.util.classLoader[module]",
        "//intellij-community:jna",
        "//intellij-community:OroMatcher",
        "//intellij-community:lz4-java",
        "//intellij-community:commons-compress",
        "//intellij-community:fastutil-min",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community/platform/util/base:intellij.platform.util.base[module]",
        "//intellij-community:aalto-xml",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/util/trove:intellij.platform.util.trove[module]",
        "//intellij-community:kotlinx-collections-immutable",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.util.ui",
    srcs = ["ui/src"],
    iml_files = ["intellij.platform.util.ui.iml"],
    javacopts_from_jps = [
        "-Xlint:unchecked",
        "--add-exports",
        "java.desktop/sun.font=ALL-UNNAMED",
    ],
    resources = ["ui/resources"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:Mac",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community:imgscalr",
        "//intellij-community:jna",
        "//intellij-community:Java_Compatibility",
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/util-ex:intellij.platform.util.ex[module]",
        "//intellij-community:netty-buffer",
        "//intellij-community:caffeine",
        "//intellij-community:aalto-xml",
        "//intellij-community/platform/util/xmlDom:intellij.platform.util.xmlDom[module]",
        "//intellij-community/platform/util/zip:intellij.platform.util.zip[module]",
        "//intellij-community:jbr-api",
        "//intellij-community:jsvg",
        "//intellij-community/platform/util/rt-java8:intellij.platform.util.rt.java8[module]",
        "//intellij-community:hash4j",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
        "//intellij-community:kotlinx-serialization-core",
        "//intellij-community:kotlinx-serialization-protobuf",
    ],
)

# managed by go/iml_to_build
iml_module(
    name = "intellij.platform.concurrency",
    srcs = ["concurrency"],
    iml_files = ["intellij.platform.concurrency.iml"],
    javacopts_from_jps = ["-Xlint:unchecked"],
    visibility = ["//visibility:public"],
    # do not sort: must match IML order
    deps = [
        "//intellij-community:kotlin-stdlib",
        "//intellij-community:kotlinx-coroutines-core",
        "//intellij-community/platform/util:intellij.platform.util[module]",
        "//intellij-community/platform/core-api:intellij.platform.core[module]",
        "//intellij-community:fastutil-min",
        "//intellij-community/platform/diagnostic:intellij.platform.diagnostic[module]",
    ],
)
