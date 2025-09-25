package dev.tymoshenko.nightspace.ui.screens.auth

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntOffset
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dev.tymoshenko.nightspace.nav.authGraph
import dev.tymoshenko.nightspace.nav.screens.AuthScreens
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AuthHost() {
    val navController = rememberNavController()
    val source = Color(0xFF21243F)
    val animationSpec = tween<IntOffset>(500)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(source)
    )

    NavHost(
        navController = navController,
        startDestination = AuthScreens.Initial,
        enterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left, animationSpec) },
        exitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Left, animationSpec) },
        popEnterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Right, animationSpec) },
        popExitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Right, animationSpec) }
    ) {
        authGraph(navController)
    }
}

@Preview
@Composable
fun AuthHostPreview() {
    AuthHost()
}
