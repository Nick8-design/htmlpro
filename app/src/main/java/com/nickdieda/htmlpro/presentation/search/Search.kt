package com.nickdieda.htmlpro.presentation.search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.presentation.components.SearchBar

@Composable
fun Search(
    navController: NavController,
    viewModel: SearchViewModel
) {
    val searchText by viewModel.searchText.collectAsState()
    val results by viewModel.searchResults.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        SearchBar(
            value = searchText,
            onValueChange = viewModel::onSearchTextChange,
            onClear = { viewModel.onSearchTextChange("") },
            onDone = { /* Hide keyboard logic */ }
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (isSearching) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color(0xFFD4AF37))
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                itemsIndexed(
                    items = results,
                    // Using itemsIndexed gives us an 'index' to ensure uniqueness even if content is identical
                    key = { index, match ->
                        "${match.subtopicId}_${index}_${match.headline.headline?.hashCode()}"
                    }
                ) { index, match ->
                    SearchResultItem(match) {
                        navController.navigate("${ScreenRoutes.NotesDetails.route}/${match.subtopicId}")
                    }
                }
//                items(
//                    items = results,
//                    // Key helps Compose reuse items instead of redrawing everything (Performance!)
//                    key = { it.headline.headline + it.subtopicId }
//                ) { match ->
//                    SearchResultItem(match) {
//                        navController.navigate("${ScreenRoutes.NotesDetails.route}/${match.subtopicId}")
//                    }
//                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchResultItem(match: SearchMatch, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                text = match.topicName,
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFFD4AF37)
            )
            Text(
                text = match.headline.headline ?: match.headline.majorHeadline ?: "Note",
                style = MaterialTheme.typography.titleMedium,
                maxLines = 1
            )
            Text(
                text = match.headline.explaination ?: "",
                style = MaterialTheme.typography.bodySmall,
                maxLines = 2,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}