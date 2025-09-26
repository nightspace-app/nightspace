package dev.tymoshenko.nightspace

import androidx.compose.runtime.Composable
import dev.tymoshenko.nightspace.ui.screens.Main
import dev.tymoshenko.nightspace.ui.theme.NightspaceTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
@Composable
@Preview
fun App() {
    NightspaceTheme {
        Main()
    }
}