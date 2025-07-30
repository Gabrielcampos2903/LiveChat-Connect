package com.example.livechat_connect.functions

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.font.FontWeight
import com.example.livechat_connect.ui.theme.TextFieldContainer
import com.example.livechat_connect.ui.theme.focusedTextFieldText
import com.example.livechat_connect.ui.theme.unfocusedTextFieldText

@Composable
fun TextFields(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String
){
    val uiColor = if(isSystemInDarkTheme()) Color.White else Black

    TextField(
        modifier = modifier,
        value = "",
        onValueChange = {},
        label = {
            Text(text = label,
                style = MaterialTheme.typography.labelMedium,
                color = uiColor)
        },
        colors = TextFieldDefaults.colors(
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
            focusedTextColor = MaterialTheme.colorScheme.focusedTextFieldText,
            unfocusedTextColor = MaterialTheme.colorScheme.TextFieldContainer,
            focusedContainerColor = MaterialTheme.colorScheme.TextFieldContainer,
        ),
        trailingIcon = {
            TextButton( onClick = { /*TODO*/}) {
                Text(
                    text = trailing,
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium),
                    color = uiColor
                )
            }
        }

    )
}