package com.nickdieda.htmlpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.nickdieda.htmlpro.navigation.MyApp
import com.nickdieda.htmlpro.ui.theme.JavascriptTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
//        enableEdgeToEdge()
        setContent {
            JavascriptTheme {

                    MyApp()
                }


        }
    }
}





//@Preview(showBackground = true)
//@Composable
//fun pre(modifier: Modifier = Modifier) {
//    MyApp()
//}
//
//@Composable
//fun hi(modifier: Modifier = Modifier) {
//
//    LazyColumn(modifier=Modifier.fillMaxSize()
//    ) {
//        item {
//            Text("Hello, Compiler!")
//        }
//    }
//}


//@Composable
//fun JsPlaygroundScreen() {
//    // This state now holds the "Full Page" to render
//    var htmlToRender by remember { mutableStateOf("<html><body><h1>Output will appear here</h1></body></html>") }
//    val editorRef = remember { mutableStateOf<CodeEditor?>(null) }
//
//    Column(modifier = Modifier.padding(16.dp).fillMaxSize()) {
//        JsCodeEditor { editorRef.value = it }
//
//        Button(onClick = {
//            val userCode = editorRef.value?.text?.toString() ?: ""
//            // We wrap it so it becomes a valid HTML document
//            htmlToRender = """
//                <!DOCTYPE html>
//                <html>
//                <head>
//                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
//                    <style>
//                        body { font-family: sans-serif; padding: 20px; }
//                        button { padding: 10px; background: #6200EE; color: white; border: none; border-radius: 4px; }
//                    </style>
//                </head>
//                <body>
//                    $userCode
//                </body>
//                </html>
//            """.trimIndent()
//        }) {
//            Text("Run & Preview ▶")
//        }
//
//        Text("Live Preview:", fontWeight = FontWeight.Bold)
//
//        // The WebView now acts as the visual output
//        Box(Modifier.fillMaxWidth().weight(1f).border(1.dp, Color.Gray)) {
//            JsRunnerWebView(htmlContent = htmlToRender) { /* no-op ref */ }
//        }
//    }
//}


//@Composable
//fun JsPlaygroundScreen() {
//    var output by remember { mutableStateOf("") }
//    var htmlToRender by remember { mutableStateOf("") }
//    val editorRef = remember { mutableStateOf<CodeEditor?>(null) }
//
//    Column(modifier = Modifier
//        .padding(16.dp)
//        .fillMaxSize()) {
//        // 1. EDITOR
//        JsCodeEditor { editorRef.value = it }
//
//        Row(Modifier.padding(vertical = 8.dp)) {
//            Button(onClick = {
//                output = "" // Clear console on run
//                val userCode = editorRef.value?.text?.toString() ?: ""
//
//                // Wrap to support both "JS only" and "HTML/CSS/JS"
//                htmlToRender = if (userCode.trim().startsWith("<")) {
//                    userCode // It's HTML
//                } else {
//                    "<html><body><script>$userCode</script></body></html>" // It's JS only
//                }
//            }) {
//                Text("Run ▶")
//            }
//
//            Spacer(Modifier.width(8.dp))
//
//            Button(onClick = { output = "" }) { Text("Clear Console") }
//        }
//
//        // 2. VISUAL PREVIEW
//        Text("Visual Preview", fontWeight = FontWeight.Bold, fontSize = 12.sp)
//        Box(Modifier
//            .fillMaxWidth()
//            .weight(1f)
//            .border(1.dp, Color.Gray)) {
//            JsRunnerWebView(
//                htmlContent = htmlToRender,
//                onConsole = { msg -> output += "> $msg\n" }
//            )
//        }
//
//        // 3. CONSOLE OUTPUT
//        Text("Console", fontWeight = FontWeight.Bold, fontSize = 12.sp, modifier = Modifier.padding(top = 8.dp))
//        Box(
//            Modifier
//                .fillMaxWidth()
//                .weight(0.7f)
//                .background(Color(0xFF1E1E1E))
//                .padding(8.dp)
//        ) {
//            Text(output, color = Color.Green, fontSize = 12.sp, fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace)
//        }
//    }
//}

fun wrapJs(code: String): String {
    return """
        (function() {
            try {
                $code
            } catch(e) {
                console.log("Error: " + e.message);
            }
        })();
    """.trimIndent()
}