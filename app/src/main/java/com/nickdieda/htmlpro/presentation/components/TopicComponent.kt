package com.nickdieda.htmlpro.presentation.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.data.model.Subtopic
import com.nickdieda.htmlpro.presentation.components.textComponents.LargeTitle
import com.nickdieda.htmlpro.store.DataStoreManager

@Composable
fun TopicComponent(highlightId: Int?,topicName: String, subtopics: List<Subtopic>, dataStoreManager: DataStoreManager, nav: NavController, modifier: Modifier = Modifier) {

    Card(
        modifier = modifier



    ) {
        val goldGradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colorScheme.background.copy(alpha = 0.8f),
                MaterialTheme.colorScheme.background.copy(alpha = 0.3f),
//                MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

            )
        )

     Column(
         modifier = Modifier
             .background( brush = goldGradient)
             .padding(16.dp)

     ) {
            LargeTitle(title = topicName)

            subtopics.forEach { subtopic ->
                SubtopicComponent(
                    subtopicName = subtopic.subTopicName,
                    subId = subtopic.sutopicId,
                    nav=nav,
                    highlightId=highlightId,
                    dataStoreManager=dataStoreManager
                )
            }
        }
    }
}