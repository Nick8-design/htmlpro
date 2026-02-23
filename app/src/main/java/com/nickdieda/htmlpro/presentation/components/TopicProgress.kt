package com.nickdieda.htmlpro.presentation.components




import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nickdieda.htmlpro.presentation.components.textComponents.SmallTitle
import com.nickdieda.htmlpro.presentation.components.textComponents.TwoTitles
import com.nickdieda.htmlpro.presentation.components.textComponents.TwoTitlesCenter

@Composable
fun TopicProgress(modifier: Modifier = Modifier,progressPercent: Float,subtopic:String,totalSubtopics:Int,onsubtopic:Int,onContinue:()->Unit) {
    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.background.copy(alpha = 0.8f),
            MaterialTheme.colorScheme.background.copy(alpha = 0.3f),
//                MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

        )
    )

//        .background(brush = goldGradient)
    Card(

        modifier = modifier
            .fillMaxWidth(0.90f)
//            .height(200.dp)

    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .background(brush = goldGradient)
                    .padding(10.dp),
        ) {


            SmallTitle(
                title = subtopic
            )
            Spacer(modifier= Modifier.height(12.dp))
            Row(

                modifier = Modifier,

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {


                Box(
                    modifier = Modifier
                        .height(130.dp)
                        .width(130.dp),
                    contentAlignment = Alignment.Center,
                )
                {
                    CircularProgressIndicator(
                        progress = { 1f },
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)

                            .align(Alignment.Center),
                        color = ProgressIndicatorDefaults.circularColor.copy(alpha = 0.3f),
                        strokeWidth = 10.dp,
                        trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
                        strokeCap = ProgressIndicatorDefaults.CircularDeterminateStrokeCap,
                    )

                    CircularProgressIndicator(
                        progress = { progressPercent },
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)

                            .align(Alignment.Center),
                        color = ProgressIndicatorDefaults.circularColor,
                        strokeWidth = 10.dp,
                        trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
                        strokeCap = ProgressIndicatorDefaults.CircularDeterminateStrokeCap,
                    )

                    TwoTitlesCenter(
                        large = "${(progressPercent * 100).toInt()} %",
                        small = "Completed",
                        modifier = Modifier
                            .align(Alignment.Center),

                        styleLarge = MaterialTheme.typography.titleLarge.copy(fontSize = 18.sp),
                        styleMedium = MaterialTheme.typography.bodyLarge.copy(fontSize = 12.sp),

                        )

                }

                Spacer(modifier = Modifier.width(18.dp))


                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start


                ) {
                    Spacer(modifier = Modifier.height(10.dp))
//                    LargeTitle(title =  "${(onsubtopic.toFloat()/totalSubtopics.toFloat()*100).toInt()} %")
                    Spacer(modifier = Modifier.height(16.dp))
                    TwoTitles(
                        large = "Current Subtopic",
                        small = "Subtopic $onsubtopic of $totalSubtopics in this section",
                             styleLarge = MaterialTheme.typography.bodyMedium.copy(fontSize = 18.sp),
                        styleMedium = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp),

                        )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        horizontalArrangement = Arrangement.End,

                        modifier = Modifier


                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Button(
                            enabled = subtopic!="Start Learning",
                            modifier = Modifier,
                            onClick = onContinue

                        ) {
                            Text("Continue")
                        }
                    }
                }


            }
        }
    }
}

