package dev.tymoshenko.nightspace.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import dev.tymoshenko.nightspace.nav.screens.AuthScreens
import dev.tymoshenko.nightspace.ui.screens.auth.initial.Initial
import dev.tymoshenko.nightspace.ui.screens.auth.login.Login
import dev.tymoshenko.nightspace.ui.screens.auth.register.Register

fun NavGraphBuilder.authGraph(navController: NavHostController) {
    composable<AuthScreens.Initial> {
        Initial(navController)
    }

    composable<AuthScreens.Login> {
        Login(navController)
    }

    composable<AuthScreens.Register> {
        Register(navController)
    }
}