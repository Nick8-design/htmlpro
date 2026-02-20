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
                setEditorLanguage(TextMateLanguage.create("source.js", true))

                editorRef(this)
            }
        },
        modifier = modifier.fillMaxWidth()
    )
}

