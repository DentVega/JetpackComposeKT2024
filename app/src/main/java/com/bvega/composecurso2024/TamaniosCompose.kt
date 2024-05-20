package com.bvega.composecurso2024

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true, backgroundColor = 0xFF0000FF)
@Composable
private fun TamaniosPreview() {
    TamaniosCompose()
}

@Composable
fun TamaniosCompose() {
    Column(
        modifier = Modifier
            .size(280.dp)
            .background(Color.Yellow)
    ) {
        Column {
            Column(modifier = Modifier
                .size(260.dp)
                .background(Color.DarkGray)) {
                TextANT()
//                TextFrg(modifier = Modifier.fillMaxWidth())
//                TextFrg(modifier = Modifier.width(50.dp))
                TextFrg(modifier = Modifier
                    .requiredWidth(80.dp)//minWith
                    .requiredHeight(40.dp))
            }
            TextFrg(modifier = Modifier
                .size(width = 128.dp, height = 64.dp))
        }
    }
}