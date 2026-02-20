package com.nickdieda.htmlpro.presentation.notes


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.data.notes.HtmlNotes
import com.nickdieda.htmlpro.presentation.components.TopicComponent
import com.nickdieda.htmlpro.store.DataStoreManager


@SuppressLint("SuspiciousIndentation")
@Composable
fun Notes(nav: NavController,dataStoreManager: DataStoreManager) {

    val configuration = LocalConfiguration.current
    val columnCount = if (configuration.screenHeightDp > configuration.screenWidthDp) 1 else 2
// 1. Observe the last visited ID
    val lastVisitedId by dataStoreManager.lastSubtopicId.collectAsState(initial = null)

    // 2. State for the grid
    val gridState = rememberLazyGridState()

    LaunchedEffect(lastVisitedId) {
        lastVisitedId?.let { id ->
            val topicIndex = HtmlNotes.indexOfFirst { topic ->
                topic.subtopics.any { it.sutopicId == id }
            }
            if (topicIndex != -1) {
                gridState.animateScrollToItem(topicIndex)
            }
        }
    }
    LazyVerticalGrid(
        state = gridState,
        columns = GridCells.Fixed(columnCount),
        modifier = Modifier
            .fillMaxSize()
            .padding( 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    )
    {

            items(
                items = HtmlNotes,
                key = { it.topicId }
            ) { t ->
                TopicComponent(
                    topicName = t.topic,
                    subtopics = t.subtopics,
                    nav=nav,
                    highlightId = lastVisitedId,
                    dataStoreManager=dataStoreManager
                )
            }
        }

    }


