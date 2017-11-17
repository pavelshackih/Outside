package com.innopolis.outside.common

import android.app.Application
import android.support.multidex.MultiDexApplication
import com.innopolis.outside.di.component.AppComponent
import com.innopolis.outside.di.component.DaggerAppComponent
import com.innopolis.outside.di.module.NetworkModule
import com.innopolis.outside.di.module.SplashModule

/**
 * @author Sergey Pinkevich
 */
class BaseApp : MultiDexApplication() {

    companion object {
        var component: AppComponent? = null
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
                .networkModule(NetworkModule())
                .splashModule(SplashModule())
                .build()
    }
}