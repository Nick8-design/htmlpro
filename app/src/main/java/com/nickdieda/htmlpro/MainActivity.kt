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