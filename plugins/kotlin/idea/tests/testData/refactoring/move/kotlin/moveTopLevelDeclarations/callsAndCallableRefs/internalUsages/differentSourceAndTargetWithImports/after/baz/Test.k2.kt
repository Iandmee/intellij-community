package baz

import foo.A
import foo.O
import foo.O.objectExtensionMember2
import foo.O.objectMember2
import foo.Y
import foo.classExtension
import foo.companionExtension
import foo.objectExtension
import foo.topLevel

fun test() {
    A().classMember()
    A().classExtension()
    O.objectMember1()
    objectMember2()
    O.objectExtension()
    A.companionMember()
    A.companionExtension()
    J().javaClassMember()
    J.javaClassStaticMember()
    topLevel()
    with(O) { 1.objectExtensionMember1() }
    1.objectExtensionMember2()
    with(A) { 1.companionExtensionMember() }

    A()::classMember
    A::classMember
    A()::classExtension
    A::classExtension
    O::objectMember1
    ::objectMember2
    O::objectExtension
    A.Companion::companionMember
    (A)::companionMember
    A.Companion::companionExtension
    (A)::companionExtension
    J()::javaClassMember
    J::javaClassMember
    J::javaClassStaticMember
    ::topLevel
    ::Y
    ::YConstr
    Y::YY
    ::J
    ::JConstr
    J::JJ

    with(A()) {
        classMember()
        this.classMember()
        classExtension()
        this.classExtension()

        this::classMember
        this::classExtension
    }

    with(J()) {
        javaClassMember()
        this.javaClassMember()

        this::javaClassMember
    }
}