package com.bvega.composecurso2024.customModifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.bvega.composecurso2024.TextANT
import com.bvega.composecurso2024.TextF
import com.bvega.composecurso2024.TextFrg

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LayoutPreview() {
    GuidelineClase()
}

@Composable
fun GuidelineClase() {
    Surface(modifier = Modifier.fillMaxSize()) {
        ConstraintLayout(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
            val (textANT, textFrg, textCursosANT, textFrogames, row) = createRefs()
            val startGuideline = createGuidelineFromStart(0.25f)
            val endGuideline = createGuidelineFromEnd(0.5f)
            val topGuideline = createGuidelineFromTop(16.dp)
            val bottomGuideline = createGuidelineFromBottom(32.dp)

            TextFrg(modifier = Modifier.constrainAs(textFrg) {
                top.linkTo(topGuideline)
//                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
            TextANT(modifier = Modifier.constrainAs(textANT) {
                top.linkTo(textFrg.bottom)
                start.linkTo(textFrg.start)
            })
            Text(text = "Cursos ANT", modifier = Modifier.constrainAs(textCursosANT) {
                top.linkTo(textANT.bottom)
                start.linkTo(textANT.start)
            })
            Text(text = "Frogames", modifier = Modifier.constrainAs(textFrogames) {
                top.linkTo(textCursosANT.bottom)
                start.linkTo(startGuideline)
            })
            Row(modifier = Modifier.constrainAs(row) {
                top.linkTo(textFrogames.bottom)
                start.linkTo(textFrg.start)
            }) {
                TextANT()
                TextFrg()
            }
        }
    }
}

@Composable
fun GuidelineClase1() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            TextFrg()
            Column {
                TextANT()
                Text(text = "Cursos ANT")
                Text(text = "Frogames")
                Row {
                    TextANT()
                    TextF()
                }
            }
        }
    }
}
