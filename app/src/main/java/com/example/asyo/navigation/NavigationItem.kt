package com.example.asyo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.asyo.R

sealed class NavigationItem(var route: String, val icon: ImageVector?, var title: Int) {
    object Home : NavigationItem(MainPage.Home, Icons.Rounded.Home, R.string.home)
    object Favorite : NavigationItem(MainPage.Favorite, Icons.Rounded.Favorite, R.string.favorite)
    object Settings : NavigationItem(MainPage.Settings, Icons.Rounded.Settings, R.string.settings)
}