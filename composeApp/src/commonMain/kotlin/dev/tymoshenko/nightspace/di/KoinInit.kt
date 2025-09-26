package dev.tymoshenko.nightspace.di

import dev.tymoshenko.nightspace.di.modules.koinPlatformModule
import org.koin.core.context.startKoin

import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(koinPlatformModule)
    }
}