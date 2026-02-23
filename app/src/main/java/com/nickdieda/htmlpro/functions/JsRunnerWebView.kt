package com.nickdieda.htmlpro.functions
//
//
//import android.webkit.ConsoleMessage
//import android.webkit.JsResult
//import android.webkit.WebChromeClient
//import android.webkit.WebView
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.viewinterop.AndroidView


import android.annotation.SuppressLint
import android.webkit.CookieManager
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
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
//                settings.useWideViewPort = true
                settings.loadWithOverviewMode = true

                // Cookies are important for YouTube embeds
//                CookieManager.getInstance().setAcceptCookie(true)
//                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)

                // Helps if some content loads http inside https
                settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

                // Keep these for asset/local content
                settings.allowFileAccess = true
                settings.allowContentAccess = true

                webViewClient = WebViewClient()

                webChromeClient = object : WebChromeClient() {
                    override fun onConsoleMessage(message: ConsoleMessage): Boolean {
                        onConsole(message.message())
                        return true
                    }
                }
            }
        },
        update = { webView ->
            val containsYouTube =
                htmlContent.contains("youtube.com/embed", ignoreCase = true) ||
                        htmlContent.contains("youtube-nocookie.com/embed", ignoreCase = true)
            val form =
                htmlContent.contains("form", ignoreCase = true) ||
                        htmlContent.contains("url", ignoreCase = true)
                                ||
                                htmlContent.contains(".com", ignoreCase = true
                        )
                        ||
                        htmlContent.contains("http", ignoreCase = true
                        )

            val baseUrl = if (containsYouTube ||form ) {

                "https://local.preview"
//
            } else {
                // keeps local assets working
                "file:///android_asset/"
            }

            webView.loadDataWithBaseURL(baseUrl, htmlContent, "text/html", "UTF-8", null)
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
//
//                // ADD THESE TWO LINES:
//                settings.allowFileAccess = true
//                settings.allowContentAccess = true
//
//                webChromeClient = object : WebChromeClient() {
//                    override fun onConsoleMessage(message: ConsoleMessage): Boolean {
//                        onConsole(message.message())
//                        return true
//                    }
//                }
//            }
//        },
//        update = { webView ->
//            // Use the "android_asset" path as the Base URL
//            webView.loadDataWithBaseURL("file:///android_asset/", htmlContent, "text/html", "UTF-8", null)
//        },
//        modifier = Modifier.fillMaxSize()
//    )
//}

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




