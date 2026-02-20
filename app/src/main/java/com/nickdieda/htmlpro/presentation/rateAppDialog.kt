package com.nickdieda.htmlpro.presentation

import android.content.Intent
import android.net.Uri
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun RateAppDialog(onDismiss: () -> Unit, onRateClick: () -> Unit) {
    val context = LocalContext.current
    val packageName = context.packageName // or "com.nickdieda.javascript"

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Enjoying the App?") },
        text = { Text("If you find this JavaScript tool helpful, please take a moment to rate us on the Play Store!") },
        confirmButton = {
            TextButton(onClick = {
                onRateClick()
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("market://details?id=$packageName")
                    // Fallback for browsers if Play Store isn't installed
                    setPackage("com.android.vending")
                }
                try {
                    context.startActivity(intent)
                } catch (e: Exception) {
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName")))
                }
            }) {
                Text("RATE NOW")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("LATER")
            }
        }
    )
}