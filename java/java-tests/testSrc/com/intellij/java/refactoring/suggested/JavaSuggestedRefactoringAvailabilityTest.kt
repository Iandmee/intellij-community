// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.java.refactoring.suggested

import com.intellij.ide.highlighter.JavaFileType
import com.intellij.openapi.actionSystem.IdeActions
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.refactoring.suggested.BaseSuggestedRefactoringAvailabilityTest

class JavaSuggestedRefactoringAvailabilityTest : BaseSuggestedRefactoringAvailabilityTest() {
  override val fileType: LanguageFileType
    get() = JavaFileType.INSTANCE

  fun testCommaInParameterList() {
    doTest(
      """
        interface I {
            void foo(int p<caret>);
        }
      """.trimIndent(),
      {
        myFixture.type(", ")
      },
      expectedAvailability = Availability.Disabled
    )
  }

  fun testInconsistentState1() {
    doTest(
      """
        interface I {
            void foo(int p<caret>);
        }
      """.trimIndent(),
      {
        myFixture.type(", char c")
      },
      {
        myFixture.type("/*")
      },
      expectedAvailability = Availability.Disabled
    )
  }

  fun testInconsistentState2() {
    doTest(
      """
          class C {
            public <caret>void foo(int p) {}
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset - "public ".length)
        replaceTextAtCaret("public", "p")
        editor.caretModel.moveToOffset(editor.caretModel.offset + 2)
      },
      expectedAvailability = Availability.Disabled
    )
  }

  fun testDuplicateParameter() {
    doTest(
      """
        interface I {
            void foo(int p<caret>);
        }
      """.trimIndent(),
      {
        myFixture.type(", int p")
      },
      expectedAvailability = Availability.Disabled
    )
  }

  fun testChangeParameterTypeOfStaticMethod() {
    doTest(
      """
        class C {
            public static void foo(<caret>int p) {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("int", "long")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnTypePrivate() {
    doTest(
      """
        class C {
            private <caret>void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testAddDeprecatedAnnotation() {
    doTest(
      """
        interface I {<caret>
            void foo();
        }
      """.trimIndent(),
      {
        myFixture.performEditorAction(IdeActions.ACTION_EDITOR_ENTER)
      },
      {
        myFixture.type("@Deprecated")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "implementations")),
      expectedAvailabilityAfterResolve = Availability.NotAvailable
    )
  }

  fun testConvertMethodToField() {
    doTest(
      """
        abstract class C {
            <caret>abstract int foo(int p);
        }
      """.trimIndent(),
      {
        deleteTextAtCaret("abstract ")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset + "int foo(".length)
        deleteTextAtCaret("int p")
      },
      {
        myFixture.performEditorAction(IdeActions.ACTION_EDITOR_MOVE_CARET_LEFT)
        deleteTextAtCaret("()")
      },
      expectedAvailability = Availability.NotAvailable
    )
  }

  fun testRemoveAnnotation() {
    ignoreErrors = true
    doTest(
      """
        interface I {
        <caret>    @Unknown
            String foo();
        }
      """.trimIndent(),
      {
        myFixture.performEditorAction(IdeActions.ACTION_EDITOR_MOVE_CARET_DOWN_WITH_SELECTION)
        myFixture.performEditorAction(IdeActions.ACTION_EDITOR_DELETE)
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "implementations")),
      expectedAvailabilityAfterResolve = Availability.NotAvailable
    )
  }

  fun testMakeMethodPrivate() {
    doTest(
      """
        class C {
            <caret>public void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("public", "private")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testMakeMethodProtected() {
    doTest(
      """
        class C {
            <caret>public void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("public", "protected")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnType() {
    doTest(
      """
        class C {
            public <caret>void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnTypeOfPrivateMethod() {
    doTest(
      """
        class C {
            private <caret>void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnTypeOfStaticMethod() {
    doTest(
      """
        class C {
            public static <caret>void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnTypeOfFinalMethod() {
    doTest(
      """
        class C {
            public final <caret>void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnTypeOfMethodInFinalClass() {
    doTest(
      """
        final class C {
            public <caret>void foo() {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnTypeNoOverride() {
    doTest(
      """
        class C {
            <caret>void foo() { }
        }
        
        class D extends C {
            void foo(int p) { }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeReturnTypeWithOverride() {
    doTest(
      """
        class C {
            <caret>void foo() { }
        }
      
        class D extends C {
        }
        
        class E extends D {
            void foo() { }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "overrides"))
    )
  }

  fun testSiblingInheritedMethod() {
    doTest(
      """
        interface I {
            <caret>void foo();
        }
      
        class C {
            public void foo() {}
        }
      
        class D extends C implements I {
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("void", "int")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "implementations"))
    )
  }

  fun testChangeParameterTypeAndName() {
    doTest(
      """
        class C {
            public void foo(<caret>int p) {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("int", "long")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset + "long ".length)
        replaceTextAtCaret("p", "pNew")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "usages"))
    )
  }

  fun testChangeParameterTypeAndNameInAbstractMethod() {
    doTest(
      """
        interface I {
            void foo(<caret>int p);
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("int", "long")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset + "long ".length)
        replaceTextAtCaret("p", "pNew")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "implementations")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testChangeParameterTypeAndRenameAbstractMethod() {
    doTest(
      """
        interface I {
            void <caret>foo(int p);
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("foo", "bar")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset + "bar(".length)
        replaceTextAtCaret("int", "long")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "usages"))
    )
  }

  fun testRenameTwoParameters() {
    doTest(
      """
        class C {
            void foo(int <caret>p1, int p2) {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("p1", "p1New")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset + "p1New, int ".length)
        replaceTextAtCaret("p2", "p2New")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "usages"))
    )
  }

  fun testRenameTwoParametersInAbstractMethod() {
    doTest(
      """
        abstract class C {
            public abstract void foo(int <caret>p1, int p2);
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("p1", "p1New")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset + "p1New, int ".length)
        replaceTextAtCaret("p2", "p2New")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "implementations")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testRenameParameterAndAbstractMethod() {
    doTest(
      """
        abstract class C {
            public abstract void <caret>foo(int p1, int p2);
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("foo", "bar")
      },
      {
        editor.caretModel.moveToOffset(editor.caretModel.offset + "bar(".length)
        replaceTextAtCaret("int", "long")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "usages"))
    )
  }

  fun testChangeConstructorParameterType() {
    doTest(
      """
        class C {
            public C(<caret>int p) {
            }
        }
      """.trimIndent(),
      {
        replaceTextAtCaret("int", "long")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("C", "overrides")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }

  fun testDuplicateField() {
    doTest(
      """
        class C {
            public static final int <caret>CONST1 = 1;
        }
      """.trimIndent(),
      {
        myFixture.performEditorAction(IdeActions.ACTION_EDITOR_DUPLICATE)
      },
      {
        replaceTextAtCaret("CONST1", "CONST2")
      },
      expectedAvailability = Availability.NotAvailable
    )
  }

  fun testDuplicateMethod() {
    doTest(
      """
        class Test {
            public void <caret>foo(int p) { }
        }
      """.trimIndent(),
      {
        myFixture.performEditorAction(IdeActions.ACTION_EDITOR_DUPLICATE)
      },
      {
        replaceTextAtCaret("foo", "bar")
      },
      expectedAvailability = Availability.NotAvailable
    )
  }

  fun testSyntaxError() {
    doTest(
      """
        class C {
            void foo(Runtime<caret>Exception x) { }
        }
      """.trimIndent(),
      {
        myFixture.type(" ")
      },
      expectedAvailability = Availability.Disabled
    )
  }

  fun testOverrideMethod() {
    doTest(
      """
        interface I {
            void foo();
        }
        
        class C implements I {
            public void foo(<caret>) { }
        }
      """.trimIndent(),
      {
        myFixture.type("String s")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "usages")),
      expectedAvailabilityAfterResolve = Availability.NotAvailable
    )
  }

  fun testPrivateMethod() {
    doTest(
      """
        class C {
            private void foo(<caret>) {
            }
        }
      """.trimIndent(),
      {
        myFixture.type("int p")
      },
      expectedAvailability = Availability.Available(changeSignatureAvailableTooltip("foo", "usages")),
      expectedAvailabilityAfterBackgroundAmend = Availability.Disabled
    )
  }
}