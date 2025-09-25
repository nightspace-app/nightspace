package dev.tymoshenko.nightspace.ui.screens.auth.initial

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import dev.tymoshenko.nightspace.nav.screens.AuthScreens
import dev.tymoshenko.nightspace.nav.screens.Screens
import org.jetbrains.compose.resources.painterResource

import nightspace.composeapp.generated.resources.Res
import nightspace.composeapp.generated.resources.auth_img

@Composable
fun Initial(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .clickable {
                    navController.navigate(AuthScreens.Register)
                },
            painter = painterResource(Res.drawable.auth_img),
            contentDescription = ""
        )
    }
}