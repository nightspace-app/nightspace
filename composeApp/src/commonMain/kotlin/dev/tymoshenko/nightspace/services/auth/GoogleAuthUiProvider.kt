package dev.tymoshenko.nightspace.services.auth

import dev.tymoshenko.nightspace.data.models.GoogleAccount

expect class GoogleAuthUiProvider {
    suspend fun signIn(): GoogleAccount?
}