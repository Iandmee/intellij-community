// "Create local variable 'foo'" "true"

fun test(n: Int) {
    val f: () -> Int = {
        <caret>foo
    }
}
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateLocalVariableActionFactory$CreateLocalFromUsageAction