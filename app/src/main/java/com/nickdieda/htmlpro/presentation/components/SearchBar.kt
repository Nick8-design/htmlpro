package com.nickdieda.htmlpro.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(
    onValueChange:(it:String)->Unit,
    value:String,
    onDone:()->Unit,
    onClear:()-> Unit,
    label:String="Search ...",
    iconData: ImageVector=Icons.Default.Search

) {
    OutlinedTextField(
        value = value,
        onValueChange = {onValueChange(it)},
        placeholder = {
            Text(label,
//                color = Color(0xFFBFA76F)
            )
        },
        leadingIcon = {
            Icon(iconData, null,
//                tint = Color(0xFFD4AF37)
            )
        },

        trailingIcon = {
            if(value.isNotEmpty())
            IconButton(
                onClick = onClear
            ) {
                Icon(Icons.Default.Clear, null,
//                    tint = Color(0xFFD4AF37)
                )
            }

        },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(30.dp),
//        colors = OutlinedTextFieldDefaults.colors(
//            focusedBorderColor = Color(0xFFD4AF37),
//            unfocusedBorderColor = Color(0xFF6B5E3C),
//            focusedTextColor = Color.White,
//            unfocusedTextColor = Color.White,
//            cursorColor = Color(0xFFD4AF37)
//        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = {
               onDone
            }
        ),
    )
}