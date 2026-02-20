package com.nickdieda.htmlpro.presentation.compiler

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nickdieda.htmlpro.functions.JsCodeEditor
import com.nickdieda.htmlpro.functions.JsRunnerWebView
import com.nickdieda.htmlpro.store.DataStoreManager
import io.github.rosemoe.sora.text.Content
import io.github.rosemoe.sora.widget.CodeEditor
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Compiler(
    initialCode: String?,
    dataStoreManager: DataStoreManager,
    editorRef: MutableState<CodeEditor?>
) {
    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("Code", "Output")
    val keyboardController = LocalSoftwareKeyboardController.current
    val scope = rememberCoroutineScope()
    var editorInitialized by rememberSaveable { mutableStateOf(false) }
    var listenerAdded by rememberSaveable { mutableStateOf(false) }
    var edited by rememberSaveable { mutableStateOf(false) }


    // Optimization States
    var isReadyToRender by remember { mutableStateOf(false) }
    val savedCode by dataStoreManager.compilerCode.collectAsState(initial = "")
    var consoleOutput by remember { mutableStateOf("> Ready\n") }
    var htmlToRender by remember { mutableStateOf("") }

    // Debounce Job for saving
    var saveJob by remember { mutableStateOf<Job?>(null) }

    val shortcuts = listOf(
        "console.log()", "let ", "const ", "function ", "=> ", "{ }", "[]",
        "<html></html>", "<body></body>", "<script></script>", "<style></style>",
        "<div></div>", "<span></span>", "class=\"\"", "id=\"\"", "display: flex;",
        "color: ", "background: ", "border: 1px solid "
    )

    // Performance: Wait for UI transition before loading WebView
    LaunchedEffect(selectedTab) {
        if (selectedTab == 1) {
            delay(250) // Buffer for navigation/tab animation
            isReadyToRender = true
        } else {
            isReadyToRender = false
        }
    }

    Column(modifier = Modifier.fillMaxSize().imePadding()) {
        TabRow(selectedTabIndex = selectedTab) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTab == index,
                    onClick = {
                        selectedTab = index
                        keyboardController?.hide()

                        if (index == 1) {

                            val code = editorRef.value?.text?.toString() ?: ""
                            consoleOutput = "> Executing...\n"
                            // Ensure proper HTML structureisNullOrEmpty
                            htmlToRender = if (code.trim().startsWith("<!DOCTYPE") || code.trim().startsWith("<html") ||code.trim().startsWith("<body") ) {
                                code
                            } else if( code.trim().startsWith("<script")|| code.trim().startsWith("<")) {
//                                "<html><body><script>${wrapJs(code)}</script></body></html>"
                                "<html><body>${code}</body></html>"
                            }else{
                                "<html><body><script>${code}</script></body></html>"
                            }


                            scope.launch {
                                dataStoreManager.saveCompilerCode(code)
                            edited=true
                            }
                        }
//                        else{
////                            if(edited){
//                                editorRef.value?.setText(savedCode)
////                                edited=false
////                            }
//                        }
                    },
                    text = { Text(title) }
                )
            }
        }

        Box(modifier = Modifier.fillMaxSize()) {
            if (selectedTab == 0) {
                // --- CODE EDITOR TAB ---
//                if(edited){
//                    editorRef.value?.setText(savedCode)
//                    edited=false
//                }

                Column(modifier = Modifier.fillMaxSize()) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                    )
                    {
                        OutlinedButton(onClick = {

                        }) { Text("Clear") }
                        OutlinedButton(onClick = { editorRef.value?.setText(savedCode) }) { Text("Restore") }
                    }

                    // Shortcuts Bar
                    Surface(tonalElevation = 3.dp, modifier = Modifier.fillMaxWidth()) {
                        ScrollableTabRow(
                            selectedTabIndex = 0,
                            divider = {},
                            indicator = {},
                            edgePadding = 8.dp,
                            containerColor = Color.Transparent
                        )
                        {
                            shortcuts.forEach { label ->
                                AssistChip(
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
                                    onClick = {
                                        editorRef.value?.let { editor ->
                                            editor.insertText(label, label.length)
                                            // Place cursor inside brackets/tags
                                            if (label.contains("()")) {
                                                editor.setSelection(editor.cursor.leftLine, editor.cursor.leftColumn - 1)
                                            }
                                        }
                                    },
                                    label = { Text(label, fontSize = 11.sp) }
                                )
                            }
                        }
                    }

                    JsCodeEditor(
                        modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
                    ) { editor ->
                        editorRef.value = editor

//                        if(edited){
                    editorRef.value?.setText(savedCode)
//                    edited=false
//                }

//                        val codeToSet = if (!initialCode.isNullOrEmpty()) initialCode else savedCode
                        val codeToSet = when {
                            savedCode.isNotBlank() -> savedCode
                            !initialCode.isNullOrBlank() -> initialCode
                            else -> ""
                        }
                        if (!editorInitialized) {
                            editor.setText(codeToSet)
                            editorInitialized = true
                        }

//                        editor.setText(codeToSet)

                        // Optimized Debounced Save
//                        editor.getText().addContentListener(object : io.github.rosemoe.sora.text.ContentListener {
//                            override fun beforeReplace(content: Content) {}
//                            override fun afterInsert(content: Content, sl: Int, sc: Int, el: Int, ec: Int, text: CharSequence) {
//                                triggerSave(content.toString())
//                            }
//                            override fun afterDelete(content: Content, sl: Int, sc: Int, el: Int, ec: Int, text: CharSequence) {
//                                triggerSave(content.toString())
//                            }
//
//                            private fun triggerSave(text: String) {
//                                saveJob?.cancel()
//                                saveJob =
//                                    scope.launch {
//                                    delay(800) // Wait for user to stop typing
//                                    dataStoreManager.saveCompilerCode(text)
//                                }
//                            }
//
//
//                        })
//



                        // ✅ 3) Add listener ONCE (otherwise you add many listeners)
                        if (!listenerAdded) {
                            listenerAdded = true

                            editor.getText().addContentListener(object :
                                io.github.rosemoe.sora.text.ContentListener {
                                override fun beforeReplace(content: Content) {}

                                override fun afterInsert(
                                    content: Content,
                                    sl: Int,
                                    sc: Int,
                                    el: Int,
                                    ec: Int,
                                    text: CharSequence
                                ) = triggerSave(content.toString())

                                override fun afterDelete(
                                    content: Content,
                                    sl: Int,
                                    sc: Int,
                                    el: Int,
                                    ec: Int,
                                    text: CharSequence
                                ) = triggerSave(content.toString())

                                private fun triggerSave(text: String) {
                                    saveJob?.cancel()
                                    saveJob = scope.launch {
                                        delay(800)
                                        dataStoreManager.saveCompilerCode(text)
                                    }
                                }
                            })

                        }


                    }
                }
            } else {
//                editorRef.value?.setText(savedCode)
                // --- OUTPUT TAB ---
                Column(modifier = Modifier.fillMaxSize()) {
                    Box(modifier = Modifier.weight(0.75f).fillMaxWidth().border(1.dp, Color.Gray)) {
                        if (isReadyToRender) {
                            JsRunnerWebView(
                                htmlContent = htmlToRender,
                                onConsole = { msg -> consoleOutput += "> $msg\n" }
                            )
                        } else {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                CircularProgressIndicator()
                            }
                        }
                    }

                    // Console Output
                    Box(
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                            .background(Color(0xFF0D0D0D))
                            .padding(8.dp)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(
                            text = consoleOutput,
                            color = Color(0xFF00FF41),
                            fontFamily = FontFamily.Monospace,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}






//package com.nickdieda.javascript.presentation.compiler
//
//import android.net.Uri
//import androidx.activity.compose.rememberLauncherForActivityResult
//import androidx.activity.result.contract.ActivityResultContracts
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.MoreVert
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.nickdieda.javascript.functions.JsCodeEditor
//import com.nickdieda.javascript.functions.JsRunnerWebView
//import com.nickdieda.javascript.store.DataStoreManager
//
//import com.nickdieda.javascript.wrapJs
//import io.github.rosemoe.sora.text.Content
//import io.github.rosemoe.sora.widget.CodeEditor
//import kotlinx.coroutines.launch
//
//import androidx.compose.ui.platform.LocalSoftwareKeyboardController

//@Composable
//fun Compiler(
//    initialCode: String?,
//    dataStoreManager: DataStoreManager,
//    editorRef: MutableState<CodeEditor?>
//) {
//    var selectedTab by remember { mutableIntStateOf(0) }
//    val tabs = listOf("Code", "Output")
//
//    val context = LocalContext.current
//
//    val keyboardController = LocalSoftwareKeyboardController.current
//
//    val savedCode by dataStoreManager.compilerCode.collectAsState(initial = "")
//    var consoleOutput by remember { mutableStateOf("> Ready\n") }
//    var htmlToRender by remember { mutableStateOf("") }
////    val editorRef = remember { mutableStateOf<CodeEditor?>(null) }
//    val scope = rememberCoroutineScope()
//
//    // Combined shortcuts for Web Development
//    val shortcuts = listOf(
//        "console.log()", "let ", "const ", "function ", "=> ", "{ }", "[]",
//        "<html></html>", "<body></body>", "<script></script>", "<style></style>",
//        "<div></div>", "<span></span>", "class=\"\"", "id=\"\"", "display: flex;",
//        "color: ", "background: ", "border: 1.dp solid "
//    )
//
//
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .imePadding()
//    ) {
//        TabRow(selectedTabIndex = selectedTab) {
//            tabs.forEachIndexed { index, title ->
//                Tab(
//                    selected = selectedTab == index,
//                    onClick = {
//                        selectedTab = index
//                        // HIDE KEYBOARD when switching
//                        keyboardController?.hide()
//
//                        if (index == 1) {
//                            val code = editorRef.value?.text?.toString() ?: ""
//                            consoleOutput = "> Executing...\n"
//                            htmlToRender = if (code.trim().startsWith("<")) code
//                            else "<html><body><script>${wrapJs(code)}</script></body></html>"
//
//                            scope.launch { dataStoreManager.saveCompilerCode(code) }
//                        }
//                    },
//                    text = { Text(title) }
//                )
//            }
//        }
//
//        Box(modifier = Modifier
////            .fillMaxSize()
//            .imePadding()
//
//        ) {
//            if (selectedTab == 0) {
//                Column(modifier = Modifier.fillMaxSize()) {
//                    // Action Buttons
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                           .padding(4.dp),
//                        horizontalArrangement = Arrangement.Center,
//                        verticalAlignment = Alignment.CenterVertically
//
//
//
//                    ) {
//                        OutlinedButton(onClick = { editorRef.value?.setText("") }) { Text("Clear") }
//                        Spacer( modifier = Modifier.width(16.dp))
//                        OutlinedButton(onClick = { editorRef.value?.setText(savedCode) }) { Text("Restore") }
//
//
//
//                    }
//
//                    Surface(
//                        tonalElevation = 3.dp,
//                        modifier = Modifier.fillMaxWidth()
//                    ) {
//                        ScrollableTabRow(
//                            selectedTabIndex = 0,
//                            divider = {},
//                            indicator = {},
//                            edgePadding = 8.dp,
//                            containerColor = Color.Transparent
//                        ) {
//                            shortcuts.forEach { label ->
//                                AssistChip(
//                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
//                                    onClick = {
//                                        val currentEditor = editorRef.value
//                                        if (currentEditor != null) {
//                                            currentEditor.insertText(label, label.length)
//
//                                            // Logic to place cursor inside brackets
//                                            if (label.contains("()") || label.contains("{}") || label.contains(
//                                                    "[]"
//                                                ) || label.contains("{ }")
//                                            ) {
//                                                val currentCursor = currentEditor.cursor
//                                                // Move cursor back by 1 (placing it inside the pair)
//                                                currentEditor.setSelection(
//                                                    currentCursor.leftLine,
//                                                    currentCursor.leftColumn - 1
//                                                )
//                                            }
//                                        }
//                                    },
//                                    label = {
//                                        Text(
//                                            label,
//                                            fontSize = 11.sp,
//                                            fontWeight = FontWeight.Medium
//                                        )
//                                    }
//                                )
//                            }
//                        }
//                    }
//                    // EDITOR
//                    JsCodeEditor(
//                        modifier = Modifier
//                            .weight(1f)
//                            .padding(horizontal = 8.dp)
//                    ) { editor ->
//                        editorRef.value = editor
//                        val codeToSet = if (!initialCode.isNullOrEmpty()) initialCode else savedCode
//                        editor.setText(codeToSet)
//
//                        // Keep saving on change
//                        // Inside JsCodeEditor { editor -> ... } in Compiler.kt
//
//                        editor.getText().addContentListener(object : io.github.rosemoe.sora.text.ContentListener {
//                            // 1. Called before any change happens
//                            override fun beforeReplace(content: Content) {
//                                // No action needed for basic saving
//                            }
//
//                            // 2. Called after text is added (typing/pasting)
//                            override fun afterInsert(
//                                content: Content,
//                                startLine: Int, startColumn: Int,
//                                endLine: Int, endColumn: Int,
//                                insertedContent: CharSequence
//                            ) {
//                                scope.launch {
//                                    dataStoreManager.saveCompilerCode(content.toString())
//                                }
//                            }
//
//                            // 3. Called after text is removed (backspace/delete)
//                            override fun afterDelete(
//                                content: Content,
//                                startLine: Int, startColumn: Int,
//                                endLine: Int, endColumn: Int,
//                                deletedContent: CharSequence
//                            ) {
//                                scope.launch {
//                                    dataStoreManager.saveCompilerCode(content.toString())
//                                }
//                            }
//                        })
//                    }
//
//
//
//                }
//            } else {
//                // SCREEN 2: OUTPUT (75/25 Split)
//                Column(modifier = Modifier
//                    .fillMaxSize()
//
//
//                ) {
//                    Box(modifier = Modifier.weight(0.75f)
//                        .fillMaxWidth()
//
////                        .padding(top = 32.dp)
//                        .border(1.dp, Color.Gray)
////                        .background(color = Color.Gray.copy(alpha = 0.4f))
//                    ) {
//                        JsRunnerWebView(
//                            htmlContent = htmlToRender,
//                            onConsole = { msg -> consoleOutput += "> $msg\n" }
//                        )
//                    }
//
//                    Box(
//                        modifier = Modifier
//                            .weight(0.25f)
//                            .fillMaxWidth()
//                            .background(Color(0xFF0D0D0D))
//                            .padding(8.dp)
//                            .verticalScroll(rememberScrollState())
//                    ) {
//                        Text(
//                            text = consoleOutput,
//                            color = Color(0xFF00FF41),
//                            fontFamily = FontFamily.Monospace,
//                            fontSize = 12.sp
//                        )
//                    }
//                }
//            }
//        }
//    }
//}
//
fun saveFileToUri(uri: Uri, context: android.content.Context, content: String) {
    try {
        context.contentResolver.openOutputStream(uri, "wt")?.use { ost ->
            ost.write(content.toByteArray())
            ost.flush()
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}