package com.nickdieda.htmlpro.functions


import android.webkit.ConsoleMessage
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun JsRunnerWebView(
    htmlContent: String,
    onConsole: (String) -> Unit
) {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
//                settings.useWideViewPort= true

                webChromeClient = object : WebChromeClient() {
                    // This captures console.log() for our log panel
                    override fun onConsoleMessage(message: ConsoleMessage): Boolean {
                        onConsole(message.message())
                        return true
                    }

                    // This allows alert() to show a real Android dialog
                    override fun onJsAlert(view: WebView?, url: String?, msg: String?, res: JsResult?): Boolean {
                        return super.onJsAlert(view, url, msg, res)
                    }
                }
            }
        },
        update = { webView ->
            webView.loadDataWithBaseURL("https://local.preview", htmlContent, "text/html", "UTF-8", null)
        },
        modifier = Modifier
            .fillMaxSize()
//            .background(color = Color.Gray.copy(alpha = 0.4f))
    )
}

//@Composable
//fun JsRunnerWebView(
//    htmlContent: String, // Pass the full code here
//    webViewRef: (WebView) -> Unit
//) {
//    AndroidView(
//        factory = { context ->
//            WebView(context).apply {
//                settings.javaScriptEnabled = true
//                settings.domStorageEnabled = true
//
//                webChromeClient = object : WebChromeClient() {
//                    // This triggers the REAL system alert dialog
//                    override fun onJsAlert(
//                        view: WebView?,
//                        url: String?,
//                        message: String?,
//                        result: JsResult?
//                    ): Boolean {
//                        // Returning false uses the standard Android system dialog
//                        // Returning true and showing a custom AlertDialog is also possible
//                        return super.onJsAlert(view, url, message, result)
//                    }
//                }
//
//                webViewRef(this)
//            }
//        },
//        update = { webView ->
//            // Use loadDataWithBaseURL to treat the string as a real webpage
//            webView.loadDataWithBaseURL(
//                "https://local.preview",
//                htmlContent,
//                "text/html",
//                "UTF-8",
//                null
//            )
//        },
//        modifier = Modifier.fillMaxSize() // Give it space to show buttons/UI
//    )
//}


