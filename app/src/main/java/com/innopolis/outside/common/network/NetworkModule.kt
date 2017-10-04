package com.innopolis.outside.common.network

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Module
class NetworkModule {
    private val BASE_URL = "http://api.openweathermap.org/"
    val APP_ID = "60947ea90bd50c478628a9214507ef87"

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideNetworkService(retrofit: Retrofit) = retrofit.create(NetworkService::class.java)

    @Provides
    @Singleton
    fun provideService(networkService: NetworkService) = Service(networkService)
}