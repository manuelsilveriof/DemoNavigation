package com.uk.demonavigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.uk.demonavigation.ui.auth.CreateAccount
import com.uk.demonavigation.ui.auth.Login
import com.uk.demonavigation.ui.destination.Destination
import com.uk.demonavigation.ui.home.Home

object MainDestinations{
    const val Home = "Home"
    const val Destination = "Destination"

    const val Login = "Login"
    const val Create = "Create account"
    const val Route_login = "Route login"
}

@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    finishActivity: () -> Unit = {},
    navController: NavHostController = rememberNavController(),
    startDestination: String = MainDestinations.Home,
    showOnboardingInitially: Boolean = true
){

    NavHost(navController = navController,
        startDestination = startDestination,
        modifier = modifier){

        composable(MainDestinations.Home){
            BackHandler {
                finishActivity()
            }
            Home(onPressedButton = {navController.navigate(MainDestinations.Destination)},
                onLoginPressed = {navController.navigate(MainDestinations.Route_login)})
        }

        composable(MainDestinations.Destination){
            Destination(onPressedButton = {navController.navigate(MainDestinations.Home)})
        }

        navigation(
            startDestination = MainDestinations.Login,
            route = MainDestinations.Route_login){
            composable(MainDestinations.Login){
                Login(
                    onLogin = { navController.navigate(MainDestinations.Home){
                        popUpTo(MainDestinations.Route_login){
                            inclusive = true
                        }
                    } },
                    onCreateAccount={navController.navigate(MainDestinations.Create)})

            }
            composable(MainDestinations.Create){
                CreateAccount(onAccountCreated = {navController.navigate(MainDestinations.Home){
                    popUpTo(MainDestinations.Route_login){
                        inclusive = true
                    }
                } })
            }
        }

    }

}