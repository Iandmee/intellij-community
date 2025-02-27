/**
 * Some documentation.
 *
 * ```
 * Code block
 *     Second line
 *
 * Third line
 * ```
 *
 * Text between code blocks.
 * ```
 * ```
 * Text after code block.
 */
fun testMethod() {

}

class C {
}

fun test() {
    <caret>testMethod(1, "value")
}

//INFO: <div class='definition'><pre>fun testMethod(): Unit</pre></div><div class='content'><p style='margin-top:0;padding-top:0;'>Some documentation.</p>
//INFO: <div class='styled-code'><pre style="padding: 0px; margin: 0px"><span style="">Code&#32;block<br></span><span style="">&#32;&#32;&#32;&#32;Second&#32;line<br></span><span style=""><br></span><span style="">Third&#32;line</span></pre></div><p>Text between code blocks.</p>
//INFO: <div class='styled-code'><pre style="padding: 0px; margin: 0px"></pre></div><p>Text after code block.</p></div><table class='sections'></table><div class='bottom'><icon src="file"/>&nbsp;OnMethodUsageWithCodeBlock.kt<br/></div>
