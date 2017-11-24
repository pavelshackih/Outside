package com.innopolis.outside.common

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
        val component: AppComponent by lazy {
            DaggerAppComponent.builder()
                    .networkModule(NetworkModule())
                    .splashModule(SplashModule())
                    .build()
        }
    }
}