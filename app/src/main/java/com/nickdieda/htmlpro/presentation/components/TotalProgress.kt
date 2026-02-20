package com.nickdieda.htmlpro.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.nickdieda.htmlpro.data.notes.JavaScriptNotes
import com.nickdieda.htmlpro.presentation.components.textComponents.MediumTitle
import com.nickdieda.htmlpro.presentation.components.textComponents.TextGo
import com.nickdieda.htmlpro.store.DataStoreManager

@Composable
fun TotalProgress(modifier: Modifier = Modifier,
                  onArrowClicked:()->Unit,
                  completedTopics: Int,
                  totalTopic:Int,
                  dataStoreManager: DataStoreManager

) {

    val allSubIds = remember { JavaScriptNotes.flatMap { it.subtopics }.map { it.sutopicId } }
    val globalProgress by dataStoreManager.getTotalProgress(allSubIds).collectAsState(initial = 0f)
    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.background.copy(alpha = 0.8f),
            MaterialTheme.colorScheme.background.copy(alpha = 0.3f),
//                MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

        )
    )



    Card(
        modifier= modifier
            .fillMaxWidth(0.90f)

    ) {
        Column(
            horizontalAlignment =   Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(brush = goldGradient)
                .padding(10.dp)
        ) {
            TextGo(text = "Total Progress",onArrowClicked)

            MediumTitle(title = "Completed $completedTopics out of $totalTopic topics.", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(16.dp))
            LinearProgressIndicator(
                modifier = Modifier.fillMaxWidth(),
            progress = { globalProgress },
                color = ProgressIndicatorDefaults.linearColor,
            trackColor = ProgressIndicatorDefaults.linearTrackColor,
            strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
            )


        }
    }
}

