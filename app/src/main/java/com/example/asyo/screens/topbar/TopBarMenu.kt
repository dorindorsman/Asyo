package com.example.asyo.screens.topbar

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.asyo.navigation.NavigationItem

@Composable
fun TopBarMenu(navController: NavController, showMenu: Boolean, onClick: (Boolean) -> Unit) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Settings,
        NavigationItem.Favorite,
    )
    DropdownMenu(
        expanded = showMenu,
        onDismissRequest = { onClick(false) }
    ) {
        items.forEach { item ->
            DropdownMenuItem(onClick = {
                onClick(false)
                navController.navigate(item.route)
            },
                leadingIcon = { Icon(imageVector = item.icon!!, contentDescription = stringResource(id = item.title)) },
                text = { Text(stringResource(id = item.title)) }
            )

        }
    }
}

