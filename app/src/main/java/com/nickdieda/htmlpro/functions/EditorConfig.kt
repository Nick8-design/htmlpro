package com.nickdieda.htmlpro.functions

import io.github.rosemoe.sora.langs.textmate.registry.FileProviderRegistry
import io.github.rosemoe.sora.langs.textmate.registry.GrammarRegistry
import io.github.rosemoe.sora.langs.textmate.registry.ThemeRegistry
import io.github.rosemoe.sora.langs.textmate.registry.model.ThemeModel
import io.github.rosemoe.sora.langs.textmate.registry.provider.AssetsFileResolver
import org.eclipse.tm4e.core.registry.IThemeSource

object EditorManager {
    private var isInitialized = false

    fun init(context: android.content.Context) {
        if (isInitialized) return

        try {
            // Setup File Provider once
            FileProviderRegistry.getInstance().addFileProvider(
                AssetsFileResolver(context.assets)
            )

            // Load Theme once
            val themeRegistry = ThemeRegistry.getInstance()
            val themePath = "textmate/darcula.json"
            val themeStream = FileProviderRegistry.getInstance().tryGetInputStream(themePath)
            if (themeStream != null) {
                themeRegistry.loadTheme(
                    ThemeModel(
                        IThemeSource.fromInputStream(themeStream, themePath, null), "darcula")
                )
            }

            // Load Grammars once
            GrammarRegistry.getInstance().loadGrammars("languages.json")

            isInitialized = true
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}