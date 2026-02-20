package com.nickdieda.htmlpro.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nickdieda.htmlpro.presentation.components.textComponents.LargeTitle
import com.nickdieda.htmlpro.presentation.components.textComponents.SmallTitle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CertName(
    onDismissRequest:()->Unit,
    fullName: String="",
    onClear:()->Unit,
    onDone:()->Unit,
    onValueChange:(it:String)->Unit,
    modifier: Modifier= Modifier,
             ) {

    val goldGradient = Brush.verticalGradient(
        colors = listOf(
            MaterialTheme.colorScheme.background.copy(alpha = 0.8f),
            MaterialTheme.colorScheme.background.copy(alpha = 0.3f),
//                MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)

        )
    )


    BasicAlertDialog(
        onDismissRequest=onDismissRequest,
        modifier = modifier,
//        DialogProperties(),


    ) {
        Card(

        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(brush = goldGradient)
                    .padding(10.dp)

                ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                LargeTitle(title = "Certificate Holder's Name")
                Spacer(modifier = Modifier.height(32.dp))

                SearchBar(
                    onValueChange = {
                        onValueChange(it)
                    },
                    value = fullName,
                    onDone = {
                        onDone()
                    },
                    onClear = {
                        onClear()
                    },
                    label = "Enter Full Name",
                    iconData = Icons.Default.PermIdentity
                )


                Spacer(modifier = Modifier.height(32.dp))

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp,Alignment.End)
                ){
                    Button(
                        enabled = fullName.isNotEmpty(),
                        onClick = {
                            onDismissRequest()
                        },

                    ) {
                        SmallTitle(title = "Cancel")
                    }
                    Button(
                        enabled = fullName.isNotEmpty(),
                        onClick = {
                            onDone()
                        },

                        ) {
                        SmallTitle(title = "Claim")
                    }

                }
                Spacer(modifier = Modifier.height(16.dp))
                SmallTitle(title = "Note: Certificate will only be given one!!")
            }

        }
    }

}


@Preview(showBackground = true)
@Composable
private fun certnamepre() {
    CertName({},"",{},{},{})
}