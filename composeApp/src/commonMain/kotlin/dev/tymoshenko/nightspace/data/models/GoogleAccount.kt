package dev.tymoshenko.nightspace.data.models

data class GoogleAccount(
    val token: String,
    val displayName: String = "",
    val profileImgUrl: String? = null
)