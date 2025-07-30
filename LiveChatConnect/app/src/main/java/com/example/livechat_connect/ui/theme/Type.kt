package com.example.livechat_connect.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.livechat_connect.R

val  Rubik = FontFamily(
    listOf(
        Font(resId = R.font.rubikmedium, weight = FontWeight.Medium),
        Font(resId = R.font.rubikbold, weight = FontWeight.Medium),
        Font(resId = R.font.rubikregular, weight = FontWeight.Normal),

    )
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 32.sp
    ),

    headlineMedium = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),

    titleMedium = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),

    labelMedium = TextStyle (
        fontFamily = Rubik,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)