package dev.tymoshenko.nightspace.services.auth

import dev.tymoshenko.nightspace.data.models.GoogleAccount
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIApplication
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


actual class GoogleAuthUiProvider {
    @OptIn(ExperimentalForeignApi::class)
    actual suspend fun signIn(): GoogleAccount? =
        suspendCoroutine { continutation ->

            val rootViewController =
                UIApplication.sharedApplication.keyWindow?.rootViewController

            if (rootViewController == null) {
                continutation.resume(null)
            } else {
//                GIDClient.sharedInstance
//                    .signInWithPresentingViewController(rootViewController) { gidSignInResult, nsError ->
//                        nsError?.let { println("Error While signing: $nsError") }
//                        val idToken = gidSignInResult?.user?.idToken?.tokenString
//                        val profile = gidSignInResult?.user?.profile
//                        if (idToken != null) {
//                            val googleUser =
//                                GoogleAccount(
//                                    token = idToken,
//                                    displayName = profile?.name ?: "",
//                                    profileImgUrl = profile?.imageURLWithDimension(320u)?.absoluteString,
//                                )
//                            continutation.resume(googleUser)
//                        } else {
//                            continutation.resume(null)
//                        }
//                    }
            }
        }
}