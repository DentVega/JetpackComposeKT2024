package com.bvega.composecurso2024

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true, backgroundColor = 0xFF0000FF)
@Composable
private fun EspaciosPreview() {
    EspaciosCompose()
}

@Composable
fun EspaciosCompose() {
    Box(modifier = Modifier
        .padding(16.dp)
        .background(Color.Cyan.copy(alpha = 0.6f))
        .fillMaxSize()) {
        TextANT()
        TextFrg(
            modifier = Modifier
//            .paddingFromBaseline(top = 40.dp)
                .offset(x = 16.dp, y = (-8).dp)
        )
    }
}