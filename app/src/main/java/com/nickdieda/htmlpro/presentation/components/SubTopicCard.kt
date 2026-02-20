package com.nickdieda.htmlpro.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.presentation.components.textComponents.TextGo
import com.nickdieda.htmlpro.store.DataStoreManager

@Composable
fun SubtopicComponent(subtopicName: String,highlightId: Int?, subId: Int, dataStoreManager: DataStoreManager, nav: NavController, modifier: Modifier = Modifier) {
    val progress by dataStoreManager.getSubtopicProgress(subId).collectAsState(initial = 0f)
    val isHighlighted = subId == highlightId
    Row (
        modifier= modifier
            .background(if (isHighlighted) MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.4f) else Color.Transparent,MaterialTheme.shapes.medium)
            .padding(horizontal = 20.dp, vertical = 6.dp)
            .fillMaxWidth()

            .clickable{
                nav.navigate("${ScreenRoutes.NotesDetails.route}/$subId")
            }
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,

    ){
        CircularProgressIndicator(
            modifier= Modifier
                .size(30.dp),
            progress = { progress }
        )

        Spacer(modifier= Modifier.width(10.dp))
        TextGo(text = subtopicName,
            onArrowClicked = {
            nav.navigate("${ScreenRoutes.NotesDetails.route}/$subId")

        }
        )


    }

}