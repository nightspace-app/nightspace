package dev.tymoshenko.nightspace.di.modules

import dev.tymoshenko.nightspace.services.auth.GoogleAuthProvider

import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

actual val koinPlatformModule: Module =
    module {
        factoryOf(::GoogleAuthProvider) bind GoogleAuthProvider::class
    }