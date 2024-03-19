package com.uk.demonavigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController
import com.uk.demonavigation.ui.theme.DemoNavigationTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainApp(finishActivity: () -> Unit){
    DemoNavigationTheme {
        val navController = rememberNavController()

        Surface {
            Scaffold { innerPaddingValues ->
                NavGraph(finishActivity = finishActivity,
                    navController = navController,
                    modifier = Modifier.padding(innerPaddingValues))
            }
        }
    }
}