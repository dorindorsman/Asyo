package com.example.asyo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.asyo.navigation.MainPage.Favorite
import com.example.asyo.navigation.MainPage.Home
import com.example.asyo.navigation.MainPage.Settings
import com.example.asyo.screens.FavoriteScreen
import com.example.asyo.screens.HomeScreen
import com.example.asyo.screens.SettingsScreen
import kotlinx.coroutines.Job

object MainPage {
    const val Home = "Home"
    const val Favorite = "Favorite"
    const val Settings = "Settings"
}

@Composable
fun MainNavigation(
    navController: NavHostController,
    modifier: Modifier,
    onClick: () -> Job
) {
    NavHost(navController, startDestination = Home, modifier = modifier) {
        composable(route = Home) {
            HomeScreen(onClick =  onClick)
        }

        composable(route = Settings) {
            SettingsScreen(onClick= onClick)
        }

        composable(route = Favorite) {
            FavoriteScreen(onClick =  onClick)
        }
    }
}