// "Create local variable 'foo'" "true"

fun test(n: Int) {
    val f: (Int, Int) -> Int = { a, b -> <caret>foo }
}
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateLocalVariableActionFactory$CreateLocalFromUsageAction