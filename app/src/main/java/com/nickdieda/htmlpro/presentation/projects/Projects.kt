package com.nickdieda.htmlpro.presentation.projects

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.documentfile.provider.DocumentFile
import androidx.navigation.NavController
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.presentation.FileItem
import com.nickdieda.htmlpro.store.DataStoreManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Projects(navController: NavController, dataStoreManager: DataStoreManager) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    // UI State
    var fileList by remember { mutableStateOf<List<DocumentFile>>(emptyList()) }
    var isLoading by remember { mutableStateOf(false) }
    var menuExpanded by remember { mutableStateOf(false) }

    // Load saved URI from DataStore (You'll need to add projectFolderUri to your DataStoreManager)
    val savedFolderUriStr by dataStoreManager.projectFolderUri.collectAsState(initial = "")

    // Function to load files safely
    val loadFiles: (Uri) -> Unit = { uri ->
        scope.launch {
            isLoading = true
            try {
                val files = withContext(Dispatchers.IO) {
                    val root = DocumentFile.fromTreeUri(context, uri)
                    root?.listFiles()?.filter { file ->
                        val name = file.name?.lowercase() ?: ""
                        name.endsWith(".js") || name.endsWith(".html") || name.endsWith(".css")
                    } ?: emptyList()
                }
                fileList = files
            } catch (e: Exception) {
                // Error tolerance: prevent crash
                e.printStackTrace()
            } finally {
                isLoading = false
            }
        }
    }

    // Auto-load if URI is already saved
    LaunchedEffect(savedFolderUriStr) {
        if (savedFolderUriStr.isNotEmpty()) {
            loadFiles(Uri.parse(savedFolderUriStr))
        }
    }

    val directoryLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocumentTree()
    ) { uri ->
        uri?.let {
            context.contentResolver.takePersistableUriPermission(
                it, android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION
            )
            scope.launch { dataStoreManager.saveProjectFolderUri(it.toString()) }
            loadFiles(it)
        }
    }


        Box(modifier = Modifier

            .fillMaxSize()) {
            if (isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            } else if (fileList.isEmpty()) {
                Button(
                    modifier = Modifier.align(Alignment.Center),
                    onClick = { directoryLauncher.launch(null) }
                ) {
                    Text("Select Project Folder")
                }
            } else {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(fileList) { file ->
                        FileItem(file) {
                            scope.launch {
                                try {
                                    val content = withContext(Dispatchers.IO) {
                                        context.contentResolver.openInputStream(file.uri)?.use {
                                            it.bufferedReader().readText()
                                        } ?: ""
                                    }

                                    // Inside FileItem onClick in Projects.kt
                                    val encodedCode = URLEncoder.encode(
                                        content,
                                        StandardCharsets.UTF_8.toString()
                                    )
                                    if (content.isNotEmpty()) {
                                        val codeBytes = content.toByteArray(java.nio.charset.StandardCharsets.UTF_8)
                                        val encodedCode = android.util.Base64.encodeToString(codeBytes, android.util.Base64.URL_SAFE or android.util.Base64.NO_WRAP)
                                        navController.navigate("${ScreenRoutes.Compiler.route}/$encodedCode")
                                    } else {
                                        navController.navigate(ScreenRoutes.Compiler.route)
                                    }

//                                    if (encodedCode.isNotEmpty()) {
//                                        navController.navigate("${ScreenRoutes.Compiler.route}/$encodedCode")
//                                    } else {
//                                        navController.navigate(ScreenRoutes.Compiler.route)
//                                    }



                                    // CRITICAL: Encode the code for the NavRoute
//                                    val encodedCode = URLEncoder.encode(content, StandardCharsets.UTF_8.toString())
//                                    navController.navigate("${ScreenRoutes.Compiler.route}/$encodedCode")
                                } catch (e: Exception) {
                                    // Handle read errors without crashing
                                }
                            }
                        }
                    }
                }
            }
        }
//    }
}

