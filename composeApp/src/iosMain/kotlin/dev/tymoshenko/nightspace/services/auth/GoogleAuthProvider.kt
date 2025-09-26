package dev.tymoshenko.nightspace.services.auth

import androidx.compose.runtime.Composable
import kotlinx.cinterop.ExperimentalForeignApi

actual class GoogleAuthProvider {
    @Composable
    actual fun getUiProvider(): GoogleAuthUiProvider = GoogleAuthUiProvider()


    @OptIn(ExperimentalForeignApi::class)
    actual suspend fun signOut() {
        GIDSignIn.sharedInstance.signOut()
    }
}