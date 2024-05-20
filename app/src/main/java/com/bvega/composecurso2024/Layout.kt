package com.bvega.composecurso2024

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LayoutPreview() {
    NewFrameLayout()
}

@Composable
fun NewFrameLayout() {
    CustomLinearLayoutVertical()
}

@Composable
fun ExampleText() {
    Text(text = "Curso Android ANT!", modifier = Modifier.background(Color.Cyan))
    Text(text = "Curso de Froo games!", modifier = Modifier.background(Color.Magenta))
}

@Composable
fun CustomBox() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        ExampleText()
    }
}

@Composable
fun CustomLinearLayoutHorizontal() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ExampleText()
    }
}

@Composable
fun CustomLinearLayoutVertical() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        ExampleText()
    }
}

@Composable
fun CustomConstraintLayout() {
//    ConstraintLayout()
}
