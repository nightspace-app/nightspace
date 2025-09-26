package dev.tymoshenko.nightspace

import androidx.compose.ui.window.ComposeUIViewController
import dev.tymoshenko.nightspace.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }