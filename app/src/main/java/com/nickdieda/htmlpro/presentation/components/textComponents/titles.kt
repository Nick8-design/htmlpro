package com.nickdieda.htmlpro.presentation.components.textComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LargeTitle(modifier: Modifier = Modifier, title: String,style: TextStyle=MaterialTheme.typography.titleLarge) {
    Text(
        text = title,
        style = style,
        modifier=modifier,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,

    )
}

@Composable
fun MediumTitle(modifier: Modifier = Modifier, title: String, style: TextStyle=MaterialTheme.typography.bodyLarge){
    Text(
        text = title,
        style = style,
        modifier=modifier,


    )
}


@Composable
fun SmallTitle(modifier: Modifier = Modifier, title: String,style: TextStyle=MaterialTheme.typography.titleSmall) {
    Text(
        text = title,
        style = style,
        modifier=modifier

    )
}






@Preview(showBackground = true)
@Composable
fun Pre(modifier: Modifier = Modifier) {
    Column(modifier=Modifier.fillMaxSize()) {
    LargeTitle(title = "Hello world")
    MediumTitle(title = "Hello world")
    SmallTitle(title = "Hello world")
}


}