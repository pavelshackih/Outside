package com.innopolis.outside.common

import com.innopolis.outside.screens.main.MainActivity
import com.innopolis.outside.common.network.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
@Component(modules = arrayOf(NetworkModule::class))
interface AppComponent {
    fun inject(activity: MainActivity)
}