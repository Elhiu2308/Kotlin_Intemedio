package com.example.cambioactivities

sealed class Screen(val route: String){
    object Login : Screen("login")
    object Home : Screen("name")
}