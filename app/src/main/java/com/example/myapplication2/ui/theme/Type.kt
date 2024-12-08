package com.example.myapplication2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication2.R

val HeroNameFont = FontFamily(Font(R.font.desc))
val HeroDescFont = FontFamily(Font(R.font.name))
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = HeroDescFont,
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp,
        lineHeight = 43.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = HeroDescFont,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = HeroNameFont,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp,
        lineHeight = 30.sp,
        letterSpacing = 1.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = HeroNameFont,
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp,
        lineHeight = 45.sp,
        letterSpacing = 2.sp
    )
)