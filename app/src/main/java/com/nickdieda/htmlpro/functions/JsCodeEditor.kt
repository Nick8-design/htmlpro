package com.nickdieda.htmlpro.functions

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import io.github.rosemoe.sora.langs.textmate.TextMateColorScheme
import io.github.rosemoe.sora.langs.textmate.TextMateLanguage
import io.github.rosemoe.sora.langs.textmate.registry.ThemeRegistry
import io.github.rosemoe.sora.widget.CodeEditor


@Composable
fun JsCodeEditor(
    modifier: Modifier = Modifier,
    editorRef: (CodeEditor) -> Unit
) {
    val context = LocalContext.current

    AndroidView(
        factory = { ctx ->
            // 1. Initialize SYNCHRONOUSLY here if not already done
            // This ensures the Registry is populated BEFORE the editor asks for "source.js"
            EditorManager.init(ctx)

            CodeEditor(ctx).apply {
                val themeRegistry = ThemeRegistry.getInstance()

                // 2. Ensure the theme is set on the registry before creating the color scheme
                themeRegistry.setTheme("darcula")

                colorScheme = TextMateColorScheme.create(themeRegistry)

                // 3. This will now find "source.js" because init() finished above
                setEditorLanguage(TextMateLanguage.create("text.html.basic", true))

                // --- ADD THESE SETTINGS ---
//                isWordwrap = false            // Disable word wrap to allow horizontal scrolling
////                isOverScrollEnabled = true    // Allow scrolling past the last line/char
////                setHorizontallyScrolling(true) // Explicitly enable horizontal scrolling
//
//                // Ensure the editor handles its own touch events inside the LazyColumn
//                isFocusable = true
//                isFocusableInTouchMode = true

                isWordwrap = false // horizontal scroll when lines are long

                // This prevents LazyColumn (parent) from hijacking scroll while dragging inside editor
                setOnTouchListener { v, event ->
                    v.parent?.requestDisallowInterceptTouchEvent(true)
                    false // let CodeEditor handle the touch
                }

                editorRef(this)
            }
        },
        modifier = modifier.fillMaxWidth()
    )
}

