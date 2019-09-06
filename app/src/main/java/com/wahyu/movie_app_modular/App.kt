package com.wahyu.movie_app_modular

import android.app.Application
import com.wahyu.movie_app_modular.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        configureKoin()
    }

    private fun configureKoin() = startKoin {

        androidLogger()
        androidContext(this@App)
        androidFileProperties()
        modules(appComponent)
    }
}