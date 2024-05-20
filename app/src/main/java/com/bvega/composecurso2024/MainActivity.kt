package com.bvega.composecurso2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.bvega.composecurso2024.ui.theme.ComposeCurso2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeCurso2024Theme {
                CustomSurface()
            }
        }
    }
}

@Composable
fun CustomSurface() {
//    Surface(modifier = Modifier.fillMaxSize()) {
    Surface(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {
//        NewFrameLayout()
        TamaniosCompose()
    }
}

@Composable
fun CustomScaffold() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Greeting(
            name = "Android", modifier = Modifier.padding(innerPadding)
        )
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Text(text = "Click me!")
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeCurso2024Theme {
        CustomSurface()
    }
}