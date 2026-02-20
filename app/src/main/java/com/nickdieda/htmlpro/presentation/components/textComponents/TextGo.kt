package com.nickdieda.htmlpro.presentation.components.textComponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun TextGo(text:String,onArrowClicked:()->Unit,styles: TextStyle = MaterialTheme.typography.titleMedium.copy(fontSize = 16.sp), modifier: Modifier = Modifier,) {
    Row(

        modifier=modifier,

//        horizontalArrangement = Arrangement.C,
        verticalAlignment = Alignment.CenterVertically,

    ) {


        LargeTitle(
            title = text,
            style =styles
        )
        Spacer(modifier = Modifier.weight(1f))

        IconButton(
            onClick = onArrowClicked
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                contentDescription = text
            )
        }

    }
}