package dev.tymoshenko.nightspace

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform