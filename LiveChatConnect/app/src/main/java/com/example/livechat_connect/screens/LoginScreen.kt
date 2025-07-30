package com.example.livechat_connect.screens

import androidx.annotation.ColorInt
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.content.pm.ShortcutInfoCompat.Surface
import com.example.livechat_connect.ui.theme.Black
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.livechat_connect.R
import androidx.compose.ui.unit.dp
import com.example.livechat_connect.functions.TextFields
import com.example.livechat_connect.ui.theme.BlueGray


@Composable
fun LoginScreen(){
    Surface(){
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            TopSection()

            Spacer(modifier = Modifier.height(36.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp)
            ){
                TextFields(label = "Email",
                    trailing = "",
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(15.dp))

                TextFields(label = "Password",
                    trailing = "Forgot?",
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    modifier = Modifier.fillMaxWidth()
                        .height(40.dp),
                    onClick = {/*todo*/},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isSystemInDarkTheme()) BlueGray else Black,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(size = 4.dp)
                ){
                    Text(text = "Log In",
                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium))
                }
            }

        }
    }
}



@Composable
fun TopSection(){
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black


    Box(
        contentAlignment = Alignment.TopCenter
    ){
        Image(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.46f),
            painter = painterResource(id = R.drawable.shape),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )

        Row(
            modifier = Modifier.padding(top = 80.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Column{
                Text(
                    text = "LiveChat",
                    style = MaterialTheme.typography.headlineLarge,
                    color = uiColor
                )

                Text(
                    text = "Connect",
                    style = MaterialTheme.typography.titleMedium,
                    color = uiColor
                )
            }
        }

        Text(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .align(alignment = Alignment.BottomCenter),
            text = "Login",
            style = MaterialTheme.typography.headlineLarge,
            color = uiColor
        )
    }
}






























