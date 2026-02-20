package com.nickdieda.htmlpro.presentation.sample


import android.util.Base64
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.data.samples.SampleData
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.presentation.ProjectCard
import java.nio.charset.StandardCharsets


@Composable
fun Sampler(navController: NavController) {
    val projects = remember { SampleData.getAllProjects() }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(projects) { project ->
            ProjectCard(project) {
                // 1. Convert string to ByteArray
                val codeBytes = project.code.toByteArray(StandardCharsets.UTF_8)

                // 2. Encode to Base64 (using URL_SAFE to avoid '/' characters in the route)
                val encodedCode = Base64.encodeToString(codeBytes, Base64.URL_SAFE or Base64.NO_WRAP)

                navController.navigate("${ScreenRoutes.Compiler.route}/$encodedCode")
            }
        }
    }
}


