package com.example.layoutcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutcomposeapp.ui.theme.LayoutComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun TextWithNormalPaddingPreview() {
    LayoutComposeAppTheme {
        MyOwnColumn(modifier = Modifier.padding(8.dp)) {
            Text(text = "MyOwnColumn")
            Text(text = "placed items")
            Text(text = "vertically as we wanted")
            Text(text = "We have done it")
        }
    }
}