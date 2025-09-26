package dev.tymoshenko.nightspace.di.modules

import androidx.credentials.CredentialManager
import dev.tymoshenko.nightspace.services.auth.GoogleAuthProvider
import org.koin.android.ext.koin.androidContext
import org.koin.android.java.KoinAndroidApplication.create
import org.koin.core.KoinApplication
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module
import kotlin.reflect.KClass

actual val koinPlatformModule: Module =
    module {
        factory { create(androidContext()) } bind CredentialManager::class as KClass<KoinApplication>
        factoryOf(::GoogleAuthProvider) bind GoogleAuthProvider::class
    }