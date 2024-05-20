package com.bvega.composecurso2024.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TextFieldComponent() {
    NewTextField()
}

@Composable
fun NewTextField() {
    var textValue by remember {
        mutableStateOf("Hi")
    }
    TextField(value = textValue, onValueChange = {
        textValue = it
    }, label = { Text(text = "Escribe Algo") },
        modifier = Modifier.fillMaxWidth()
    )
}
