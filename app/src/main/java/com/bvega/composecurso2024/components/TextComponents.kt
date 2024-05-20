package com.bvega.composecurso2024.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TextComponentsPreview() {
    NewTextView2()
}

@Composable
fun NewTextView() {
    Text(
        text = "Jetpack Compose 2024!",
        color = Color.DarkGray,
        fontSize = 28.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        style = TextStyle(
            shadow = Shadow(
                color = Color.Magenta, offset = Offset(x = 2f, y = 2f),
                blurRadius = 2f
            )
        )
    )
}

@Composable
fun NewTextView2() {
    Column(modifier = Modifier) {
        Text(
            text = "Jetpack Compose 2024!",
            color = Color.DarkGray,
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Magenta, offset = Offset(x = 2f, y = 2f),
                    blurRadius = 2f
                )
            )
        )
        Text(
            text = "The best Jetpack Compose course in the world wide, by Cursos Android ANT & Frogames. All rights reserved.",
            style = MaterialTheme.typography.titleLarge,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(fontWeight = FontWeight.ExtraBold)
                ) {
                    append("Batman")
                }
                append(", Bruce Wayne")
            },
        )
        Text(
            text = "Let's go to the next one.",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleMedium
        )
    }
}
