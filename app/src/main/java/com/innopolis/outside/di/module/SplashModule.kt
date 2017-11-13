package com.innopolis.outside.di.module

import com.innopolis.outside.common.network.Service
import com.innopolis.outside.screens.splash.SplashPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Module
class SplashModule {

    @Singleton
    @Provides
    fun provideSplashPresenter(service: Service) = SplashPresenter(service)
}