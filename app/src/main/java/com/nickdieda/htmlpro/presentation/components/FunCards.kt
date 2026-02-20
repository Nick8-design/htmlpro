package com.nickdieda.htmlpro.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Notes
import androidx.compose.material.icons.filled.FileOpen
import androidx.compose.material.icons.filled.Terminal
import androidx.compose.material.icons.outlined.Extension
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FunCards(
    onCompiler:()->Unit,
    onProjectClicked:()->Unit,
    onSettings:()->Unit,
    onSample:()-> Unit,
    modifier: Modifier= Modifier


             ) {
    var clickedCard by rememberSaveable {mutableStateOf(0) }


    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
//            modifier = Modifier
//                .fillMaxWidth()
//
//            ,
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.Center
        )
        {

            CardButton(
                modifier = Modifier.weight(1f).aspectRatio(2f),
                imageVector = Icons.Default.Terminal,
                ts = 32.dp,
                te = if ( clickedCard==1) 32.dp else 8.dp,
                be = if ( clickedCard==1) 32.dp else 8.dp,
                bs = if ( clickedCard==1) 32.dp else 8.dp,
                name = "Compiler",
                onClick = {
                    clickedCard=1
                    onCompiler()
                }

            )
//            Spacer(modifier = Modifier.width(16.dp))
            CardButton(
                modifier = Modifier.weight(1f).aspectRatio(2f),
                imageVector = Icons.Default.FileOpen,
                te =  32.dp ,
                ts = if ( clickedCard==2) 32.dp else 8.dp,
                bs = if ( clickedCard==2) 32.dp else 8.dp,
                be = if ( clickedCard==2) 32.dp else 8.dp,
                name = "Project",
                onClick =  {
                    clickedCard=2
                    onProjectClicked()
                }
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()

            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            CardButton(
                modifier = Modifier.weight(1f).aspectRatio(2f),
                imageVector = Icons.Outlined.Extension,
                bs =    32.dp ,
                be = if ( clickedCard==3) 32.dp else 8.dp,
                ts =  if ( clickedCard==3) 32.dp else 8.dp,
                te =  if ( clickedCard==3) 32.dp else 8.dp,
                name = "Extra" ,
                onClick ={
                    clickedCard=3
                 onSettings()}
            )
            Spacer(modifier = Modifier.width(16.dp))
            CardButton(
                modifier = Modifier.weight(1f).aspectRatio(2f),
                imageVector = Icons.AutoMirrored.Filled.Notes,
                be =   32.dp ,
                bs = if ( clickedCard==4) 32.dp else 8.dp,
                te = if ( clickedCard==4) 32.dp else 8.dp,
                ts = if ( clickedCard==4) 32.dp else 8.dp,
                name = "Samples",
                onClick = {
                    clickedCard=4
                    onSample()

                }
            )
        }


    }

}