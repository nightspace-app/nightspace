package dev.tymoshenko.nightspace.nav.screens

import kotlinx.serialization.*

@Serializable
sealed class Screens(@Serializable val route: String) {
    @Serializable
    data object Auth : Screens("auth")

    @Serializable
    data object Content : Screens("content")
}