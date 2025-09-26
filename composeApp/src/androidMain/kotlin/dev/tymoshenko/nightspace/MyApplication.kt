package dev.tymoshenko.nightspace

import android.app.Application
import dev.tymoshenko.nightspace.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApplication)
        }
    }
}