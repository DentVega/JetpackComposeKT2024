package com.bvega.composecurso2024.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bvega.composecurso2024.R

@Preview
@Composable
private fun ImageViewComponent() {
    NewImageViewComponent()
}

@Composable
fun NewImageViewComponent() {
    Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.cursos_android_ant),
            contentDescription = "Logo1 Curso Android 2024",
            modifier = Modifier
                .size(80.dp)
                .clip(shape = CircleShape)
        )
        Image(
            painter = painterResource(id = R.drawable.cursos_android_ant),
            contentDescription = "Logo2 Curso Android 2024",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .aspectRatio(4f / 3f)
        )
        Image(
            painter = painterResource(id = R.drawable.cursos_android_ant),
            contentDescription = "Logo2 Curso Android 2024",
            modifier = Modifier
                .size(80.dp)
                .blur(
                    radius = 8.dp,
                    edgeTreatment = BlurredEdgeTreatment(CircleShape)
                )
        )
        Image(
            painter = painterResource(id = R.drawable.cursos_android_ant),
            contentDescription = "Logo2 Curso Android 2024",
            modifier = Modifier
                .size(80.dp)
                .blur(
                    radius = 8.dp,
                    edgeTreatment = BlurredEdgeTreatment(
                        RoundedCornerShape(8.dp)
                    )
                )
        )
    }
//    Image(
//        painter = painterResource(id = R.drawable.cursos_android_ant),
//        contentDescription = "Logo2 Curso Android 2024",
//        modifier = Modifier
//            .size(80.dp)
//            .blur(
//                radius = 8.dp,
//                edgeTreatment = BlurredEdgeTreatment.Unbounded
//            )
//    )
}

