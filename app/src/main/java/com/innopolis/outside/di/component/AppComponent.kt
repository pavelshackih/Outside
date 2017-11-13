package com.innopolis.outside.di.component

import com.innopolis.outside.screens.main.MainActivity
import com.innopolis.outside.di.module.NetworkModule
import com.innopolis.outside.di.module.SplashModule
import com.innopolis.outside.screens.splash.SplashActivity
import dagger.Component
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
@Component(modules = arrayOf(NetworkModule::class, SplashModule::class))
interface AppComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: SplashActivity)
}