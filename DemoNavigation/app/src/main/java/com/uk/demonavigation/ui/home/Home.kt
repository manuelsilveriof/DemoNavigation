package com.uk.demonavigation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uk.demonavigation.ui.theme.DemoNavigationTheme

@Composable
fun Home(onPressedButton: () -> Unit, onLoginPressed: () -> Unit){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Text(text = "Home", modifier = Modifier.padding(24.dp))
            Button(onClick = { onPressedButton()}, modifier = Modifier.padding(24.dp)) {
                Text(text = "Tap here to navigate to destination")
            }
            Button(onClick = { onLoginPressed()}, modifier = Modifier.padding(24.dp)) {
                Text(text = "Login")
            }
        }
    }
}

@Composable
@Preview(name = "Home")
private fun HomePreview(){
    DemoNavigationTheme {
        Home(onPressedButton = {}, onLoginPressed = {})
    }
}