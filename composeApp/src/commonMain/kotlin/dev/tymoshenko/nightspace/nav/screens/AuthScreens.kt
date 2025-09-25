package dev.tymoshenko.nightspace.nav.screens

import kotlinx.serialization.Serializable

@Serializable
sealed class AuthScreens(@Serializable val route: String) {
    @Serializable
    data object Initial : AuthScreens("initial")

    @Serializable
    data object Login : AuthScreens("login")

    @Serializable
    data object Register : AuthScreens("register")
}