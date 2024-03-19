package com.uk.demonavigation.ui.destination

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
import com.uk.demonavigation.ui.home.Home
import com.uk.demonavigation.ui.theme.DemoNavigationTheme

@Composable
fun Destination(onPressedButton: () -> Unit){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Text(text = "Destination", modifier = Modifier.padding(24.dp))
            Button(onClick = {onPressedButton() }, modifier = Modifier.padding(24.dp)) {
                Text(text = "Tap here to navigate home")
            }
        }
    }
}

@Composable
@Preview(name = "Destination")
private fun DestinationPreview(){
    DemoNavigationTheme {
        Destination{

        }
    }
}