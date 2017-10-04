package com.innopolis.outside.common

import android.app.Application
import com.innopolis.outside.common.network.NetworkModule

/**
 * @author Sergey Pinkevich
 */
class BaseApp : Application() {

    companion object {
        var component: AppComponent? = null
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
                .networkModule(NetworkModule())
                .build()
    }
}