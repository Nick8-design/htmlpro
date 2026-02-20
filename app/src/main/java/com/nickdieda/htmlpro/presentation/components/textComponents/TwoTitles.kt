package com.nickdieda.htmlpro.presentation.components.textComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle


@Composable
fun TwoTitles(large : String,small:String,modifier: Modifier = Modifier,styleLarge: TextStyle = MaterialTheme.typography.bodyLarge,styleMedium: TextStyle=MaterialTheme.typography.bodyLarge  ) {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier=modifier
    ){
        LargeTitle(title = large, style =styleLarge)
        MediumTitle(title = small, style =styleMedium)

    }
}

@Composable
fun TwoTitlesCenter(large : String,small:String,modifier: Modifier = Modifier,styleLarge: TextStyle = MaterialTheme.typography.bodyLarge,styleMedium: TextStyle=MaterialTheme.typography.bodyLarge  ) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier=modifier
    ){
        LargeTitle(title = large, style =styleLarge)
        MediumTitle(title = small, style =styleMedium)

    }
}
