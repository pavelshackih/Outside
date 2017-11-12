package com.innopolis.outside.common

import com.innopolis.outside.screens.main.MainPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Module
class MainModule {

    @Singleton
    @Provides
    fun providePresenter() = MainPresenter()
}