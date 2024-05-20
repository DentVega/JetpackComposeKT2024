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
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LayoutPreview() {
    NewFrameLayout()
}

@Composable
fun NewFrameLayout() {
    CustomConstraintLayout()
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
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (normalA, normalB, filledF, container) = createRefs()
        Text(
            text = "Normal A",
            modifier = Modifier.constrainAs(normalA) {
                top.linkTo(parent.top)
            }
        )
        Text(
            text = "Normal B",
            modifier = Modifier.constrainAs(normalB) {
                top.linkTo(normalA.bottom)
            }
        )
        TextF(modifier = Modifier.constrainAs(filledF) {
            top.linkTo(normalB.top)
            start.linkTo(normalB.end)
        })
        Row(modifier = Modifier.constrainAs(container) { top.linkTo(normalB.bottom) }) {
            ExampleText()
            TextF()
        }
    }
}

@Composable
fun TextF(modifier: Modifier = Modifier) = Text(
    text = "Filled F",
    modifier = Modifier
        .background(Color.LightGray)
        .then(modifier)
)
