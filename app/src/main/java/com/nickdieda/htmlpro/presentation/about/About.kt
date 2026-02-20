package com.nickdieda.htmlpro.presentation.about


import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.nickdieda.htmlpro.presentation.components.AboutItem


@Composable
fun AboutScreen() {
 val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        item {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = "JavaScript Learning App",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Learn JavaScript, read notes, and run code offline.",
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.height(20.dp))
            }
        }

        item {
            AboutItem(
                icon = Icons.Default.MenuBook,
                title = "Interactive Notes",
                description = "Step-by-step JavaScript lessons with explanations and examples."
            )
        }

        item {
            AboutItem(
                icon = Icons.Default.Code,
                title = "Built-in Compiler",
                description = "Write and execute JavaScript code instantly."
            )
        }

        item {
            AboutItem(
                icon = Icons.Default.Build,
                title = "Practice Projects",
                description = "Experiment and improve your coding skills."
            )
        }

        item {
            Spacer(modifier = Modifier.height(20.dp))
//            Divider()
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(Icons.Default.Person, contentDescription = null)
//                Spacer(modifier = Modifier.width(8.dp))
//                Text(
//                    text = "Developed by DND",
//                    style = MaterialTheme.typography.bodyLarge
//                )
//            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Version 1.0.0"
            ,
                style = MaterialTheme.typography.titleMedium)

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "This app helps students learn JavaScript through structured notes and an integrated coding environment.",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1G2aJ0c61KyyYOM7-ZA6JR0jHdPh9xs3ZzqM9CFMbhJ8/edit?usp=sharing"))
                    context.startActivity(intent)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Privacy Policy")
            }
        }
    }
}

//


@Preview
@Composable
private fun preAb() {
    AboutScreen()
}