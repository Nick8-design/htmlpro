package com.nickdieda.htmlpro.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nickdieda.htmlpro.R
import com.nickdieda.htmlpro.presentation.components.textComponents.TwoTitles

@Composable
fun CertCard(
    onClaim:()->Unit,
    progress: Float
) {



    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.background.copy(alpha = 0.8f),
            MaterialTheme.colorScheme.background.copy(alpha = 0.3f),
//                MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

        )
    )
    Card(
        modifier = Modifier
            .clickable{
                onClaim()
            }
    ){
        Row (

            modifier = Modifier
                .fillMaxWidth(0.90f)
                .background(brush = goldGradient)
                .padding(16.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly

        ){
            Image(
                painter = painterResource(R.drawable.certificate),
                contentDescription = "Certificate",
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)

            )
            TwoTitles(
                large = "Claim certificate",
                small = certTitle(progress),
                modifier = Modifier
                    .clickable{
                        onClaim()
                    }

            )

        }
    }


}


fun certTitle(p: Float): String{
    when {
        p == 0f -> return "Start learning "
        p < 1f -> return "Learning in progress"
        p == 1f -> return "Certificate earned"
        else -> return "Claim now"

    }
    }


@Preview
@Composable
private fun certpr() {
   CertCard({},0f)
}