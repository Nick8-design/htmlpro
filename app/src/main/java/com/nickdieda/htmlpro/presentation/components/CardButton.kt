package com.nickdieda.htmlpro.presentation.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CardButton(
    imageVector: ImageVector=Icons.Outlined.Settings,
    name:String = "Settings",
    modifier: Modifier = Modifier,
    ts: Dp =8.dp,
    te: Dp =8.dp,
    bs: Dp =8.dp,
    be: Dp =8.dp,
    onClick: () -> Unit = {},
//    cardWidth: Dp = 180.dp



) {
    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.background.copy(alpha = 0.8f),
            MaterialTheme.colorScheme.background.copy(alpha = 0.3f),
//                MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

        )
    )



    Card(
        shape = RoundedCornerShape(
            topStart = ts,   // more curved
            topEnd = te,      // less curved
            bottomEnd = be,   // less curved
            bottomStart = bs  // less curved
        ),
        modifier = modifier,
//            .width(cardWidth)
//            .heightIn(min = 80.dp),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .background(brush = goldGradient)
                .fillMaxSize(),
//            modifier = Modifier
//                .width(180.dp)
//                .heightIn(min = 80.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                name,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }



}

@Preview(showBackground = true)
@Composable
fun CardButtonPre(modifier: Modifier = Modifier) {
    CardButton()
}