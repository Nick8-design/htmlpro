package com.nickdieda.htmlpro.presentation.settings

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.store.DataStoreManager
import kotlinx.coroutines.launch

@Composable
fun Settings(
    dataStoreManager: DataStoreManager,
    navController: NavController
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val savedName by dataStoreManager.username.collectAsState(initial = "Developer")

    var isEditing by remember { mutableStateOf(false) }
    var nameText by remember { mutableStateOf(savedName) }

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // --- PROFILE SECTION ---
        item {
            Spacer(modifier = Modifier.height(20.dp))
            if (isEditing) {
                OutlinedTextField(
                    value = nameText,
                    onValueChange = { nameText = it },
                    label = { Text("Enter Name") },
                    trailingIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                dataStoreManager.saveUsername(nameText)
                                isEditing = false
                            }
                        }) {
                            Icon(Icons.Default.Check, contentDescription = "Save")
                        }
                    }
                )
            } else {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = savedName, style = MaterialTheme.typography.headlineMedium)
                    IconButton(onClick = {
                        nameText = savedName
                        isEditing = true
                    }) {
                        Icon(Icons.Default.Edit, contentDescription = "Edit Name", modifier = Modifier.size(20.dp))
                    }
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
        }

        // --- SETTINGS GROUP ---
        item {
            SettingsItem(
                title = "Rate & Feedback",
                icon = Icons.Default.Star,
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW).apply {
                        data = Uri.parse("market://details?id=${context.packageName}")
                        setPackage("com.android.vending")
                    }
                    context.startActivity(intent)
                }
            )
            SettingsItem(
                title = "About App",
                icon = Icons.Default.Info,
                onClick = { navController.navigate(ScreenRoutes.About.route)}
            )
            SettingsItem(
                title = "About Developer",
                icon = Icons.Default.Person,
                onClick = {
                    navController.navigate(ScreenRoutes.AboutUs.route)
//                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://nickdieda.web.app"))
//                    context.startActivity(intent)
                }
            )
            SettingsItem(
                title = "Share App",
                icon = Icons.Default.Share,
                onClick = {
                    val sendIntent = Intent().apply {
                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, "Learn JavaScript with this amazing app: https://play.google.com/store/apps/details?id=${context.packageName}")
                        type = "text/plain"
                    }
                    context.startActivity(Intent.createChooser(sendIntent, null))
                }
            )
        }
    }
}

@Composable
fun SettingsItem(title: String, icon: ImageVector, onClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            Spacer(modifier = Modifier.width(16.dp))
            Text(title, style = MaterialTheme.typography.bodyLarge)
        }
    }
}