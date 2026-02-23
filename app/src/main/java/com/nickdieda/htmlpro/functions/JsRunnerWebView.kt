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

                // ADD THESE TWO LINES:
                settings.allowFileAccess = true
                settings.allowContentAccess = true

                webChromeClient = object : WebChromeClient() {
                    override fun onConsoleMessage(message: ConsoleMessage): Boolean {
                        onConsole(message.message())
                        return true
                    }
                }
            }
        },
        update = { webView ->
            // Use the "android_asset" path as the Base URL
            webView.loadDataWithBaseURL("file:///android_asset/", htmlContent, "text/html", "UTF-8", null)
        },
        modifier = Modifier.fillMaxSize()
    )
}

//@Composable
//fun JsRunnerWebView(
//    htmlContent: String,
//    onConsole: (String) -> Unit
//) {
//    AndroidView(
//        factory = { context ->
//            WebView(context).apply {
//                settings.javaScriptEnabled = true
//                settings.domStorageEnabled = true
////                settings.useWideViewPort= true
//
//                webChromeClient = object : WebChromeClient() {
//                    // This captures console.log() for our log panel
//                    override fun onConsoleMessage(message: ConsoleMessage): Boolean {
//                        onConsole(message.message())
//                        return true
//                    }
//
//                    // This allows alert() to show a real Android dialog
//                    override fun onJsAlert(view: WebView?, url: String?, msg: String?, res: JsResult?): Boolean {
//                        return super.onJsAlert(view, url, msg, res)
//                    }
//                }
//            }
//        },
//        update = { webView ->
//            webView.loadDataWithBaseURL("https://local.preview", htmlContent, "text/html", "UTF-8", null)
//        },
//        modifier = Modifier
//            .fillMaxSize()
////            .background(color = Color.Gray.copy(alpha = 0.4f))
//    )
//}




