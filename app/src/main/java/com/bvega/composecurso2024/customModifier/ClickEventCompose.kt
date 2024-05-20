package com.bvega.composecurso2024.customModifier

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bvega.composecurso2024.TextFrg

@Preview(showBackground = true, showSystemUi = true, backgroundColor = 0xFF0000FF)
@Composable
private fun ClickEventComponentPreview() {
    NewClick()
}

@Composable
fun NewClick() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.White)
    ) {
        TextButton(modifier = Modifier.padding(5.dp), onClick = {
            println("Click")
        })
    }
}

@Composable
fun TextButton(modifier: Modifier, onClick: () -> Unit) {
    TextFrg(modifier = modifier
        .size(width = 128.dp, height = 64.dp)
        .background(Color.Gray)
        .padding(16.dp)
        .clickable { onClick() }
    )
}
