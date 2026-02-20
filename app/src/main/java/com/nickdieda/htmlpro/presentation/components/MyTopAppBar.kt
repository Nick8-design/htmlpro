package com.nickdieda.htmlpro.presentation.components

import android.annotation.SuppressLint
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.presentation.compiler.saveFileToUri
import com.nickdieda.htmlpro.store.DataStoreManager
import io.github.rosemoe.sora.widget.CodeEditor
import kotlinx.coroutines.launch


@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(
    nav: NavHostController,
    onDrawableClicked:()-> Unit,
    title: String="",
    onActionClicked: () -> Unit = {},
    iconData: ImageVector = Icons.Default.Menu,
    dataStoreManager: DataStoreManager,
    currentRoute: String?,
    editorRef: MutableState<CodeEditor?>,
    subId:Int,


) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var menuExpanded by remember { mutableStateOf(false) }
    val directoryLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocumentTree()
    ) { uri ->
        uri?.let {
            context.contentResolver.takePersistableUriPermission(
                it, android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION
            )
            scope.launch { dataStoreManager.saveProjectFolderUri(it.toString()) }
//            loadFiles(it)
        }
    }

    var currentFileUri by remember { mutableStateOf<Uri?>(null) }

    val openLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        uri?.let {
            currentFileUri = it
            context.contentResolver.openInputStream(it)?.use { stream ->
                val content = stream.bufferedReader().readText()
                editorRef.value?.setText(content)
            }
        }
    }

    // SAVE AS (Create new file)
    val saveAsLauncher = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("text/plain")) { uri ->
        uri?.let {
            currentFileUri = it
            saveFileToUri(it, context, editorRef.value?.text?.toString() ?: "")
        }
    }

    // Helper function to write data
    fun performSave() {
        val code = editorRef.value?.text?.toString() ?: ""
        val uri = currentFileUri
        if (uri != null) {
            saveFileToUri(uri, context, code)
        } else {
            // If no file is associated, force "Save As" behavior
            saveAsLauncher.launch("project.js")
        }
    }



    CenterAlignedTopAppBar(
        navigationIcon = {
           IconButton(
               onClick = {onDrawableClicked()   }
           ) {
               Icon(
                   imageVector = Icons.Default.ArrowBackIosNew,
                   contentDescription = null,
//                   tint = Color(0xFFD4AF37)
               )
           }
        },
        title = {
            Text(
                text = title,
//                color = Color(0xFFD4AF37),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        },
        actions = {
            if (currentRoute == ScreenRoutes.Compiler.route || currentRoute == ScreenRoutes.Projects.route || currentRoute?.contains(
                    ScreenRoutes.Compiler.route
                ) == true
            )

                IconButton(
                    onClick = {
                        menuExpanded = true

                    }
                )
                {
                    Icon(
                        imageVector = iconData,
                        contentDescription = null,
//                tint = Color(0xFFD4AF37),
                    )
                }


            DropdownMenu(
                expanded = menuExpanded,
                onDismissRequest = { menuExpanded = false })
            {

                if (currentRoute == ScreenRoutes.Projects.route)
                    DropdownMenuItem(
                        text = { Text("Change Folder") },
                        onClick = {
                            menuExpanded = false
                            directoryLauncher.launch(null)
                        }
                    )
                if (currentRoute?.contains(ScreenRoutes.Compiler.route) == true) {
                    DropdownMenuItem(
                        text = { Text("Open File") },
                        onClick = {
                            menuExpanded = false
                            openLauncher.launch(
                                arrayOf(
                                    "text/*",
                                    "application/javascript",
                                    "text/html"
                                )
                            )
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Save") },
                        onClick = {
                            menuExpanded = false
                            performSave()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Save As") },
                        onClick = {
                            menuExpanded = false
                            saveAsLauncher.launch("new_project.js")
                        }
                    )
                }

            }




            if (currentRoute == ScreenRoutes.NotesDetails.route  || currentRoute?.contains(
                    ScreenRoutes.NotesDetails.route
                ) == true
            )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                        nav.navigate("${ScreenRoutes.Quiz.route}/$subId")

                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Quiz,
                        contentDescription = "Quiz",

                    )
                    Text("Quiz")
                }








        }



    )



}


