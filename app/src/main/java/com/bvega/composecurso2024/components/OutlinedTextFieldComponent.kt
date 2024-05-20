package com.bvega.composecurso2024.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.bvega.composecurso2024.R

@Preview(showBackground = true, showSystemUi = true, locale = "es")
@Composable
private fun OutlinedTextFieldComponentPrev() {
    NewOutlinedTextFieldComponent()
}

@Composable
fun NewOutlinedTextFieldComponent() {
    var textValue by remember {
        mutableStateOf(R.string.lifecycle.toString())
    }

    OutlinedTextField(value = textValue, onValueChange = {
        textValue = it
    }, label = { Text(text = stringResource(id = R.string.lifecycle)) },
        modifier = Modifier.fillMaxWidth()
    )

    var passwordValue by remember {
        mutableStateOf("Contraseña")
    }

    OutlinedTextField(value = passwordValue, onValueChange = {
        passwordValue = it
    }, label = { Text(text = "Contraseña") },
        singleLine = true,
        visualTransformation = PasswordVisualTransformation(),
        trailingIcon = {
            if (passwordValue.isNotEmpty()) {
                Icon(
                    imageVector = Icons.Filled.Clear,
                    contentDescription = "Clear",
                    modifier = Modifier.clickable {
                        passwordValue = ""
                    }
                )
            }
        },
        modifier = Modifier.fillMaxWidth()
    )
}
