package com.uk.demonavigation.ui.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Login(onLogin: () -> Unit, onCreateAccount: () -> Unit){
    Surface {
        Column {
            Text(text = "Login", modifier = Modifier.padding(24.dp))
            Button(onClick = { onLogin()}, modifier = Modifier.padding(24.dp)) {
                Text(text = "Login")
            }

            Button(onClick = { onCreateAccount()}, modifier = Modifier.padding(24.dp)) {
                Text(text = "Create account")
            }
        }
    }
}