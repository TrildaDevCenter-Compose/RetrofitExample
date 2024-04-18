package com.lj.app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.lj.app.R


private val Roboto = FontFamily(
    Font(R.font.roboto, FontWeight.Normal),
)


private val AppFont1 = Roboto


// Set of Material typography styles to start with
val typography1 : Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = AppFont1,
        fontSize = 57.sp,
        fontWeight = FontWeight.ExtraBold,
    ),
    displayMedium = TextStyle(
        fontFamily = AppFont1,
        fontSize = 45.sp,
        fontWeight = FontWeight.Bold,
    ),
    displaySmall =  TextStyle(
        fontFamily = AppFont1,
        fontSize = 36.sp,
        fontWeight = FontWeight.SemiBold,
    ),
    headlineLarge = TextStyle(
        fontFamily = AppFont1,
        fontSize = 32.sp,
        fontWeight = FontWeight.ExtraBold,
    ),
    headlineMedium = TextStyle(
        fontFamily = AppFont1,
        fontSize = 28.sp,
        fontWeight = FontWeight.SemiBold,
    ),
    headlineSmall = TextStyle(
        fontFamily = AppFont1,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
    ),
    titleLarge = TextStyle(
        fontFamily = AppFont1,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = AppFont1,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
    ),
    titleSmall = TextStyle(
        fontFamily = AppFont1,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
    ),
    bodyLarge = TextStyle(
        fontFamily = AppFont1,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = AppFont1,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    bodySmall =  TextStyle(
        fontFamily = AppFont1,
        fontWeight = FontWeight.ExtraLight,
        fontSize = 12.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = AppFont1,
        fontWeight = FontWeight.Black,
        fontSize = 14.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = AppFont1,
        fontWeight = FontWeight.Black,
        fontSize = 12.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = AppFont1,
        fontWeight = FontWeight.Black,
        fontSize = 10.sp,
    ),
)