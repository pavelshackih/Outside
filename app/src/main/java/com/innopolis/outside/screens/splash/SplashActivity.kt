package com.innopolis.outside.screens.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter

import com.innopolis.outside.R
import com.innopolis.outside.common.CURRENT_WEATHER
import com.innopolis.outside.common.network.NetworkService
import com.innopolis.outside.common.network.Service
import com.innopolis.outside.domain.model.CurrentWeather
import com.innopolis.outside.screens.main.MainActivity
import javax.inject.Inject

class SplashActivity : AppCompatActivity(), SplashView {

    @Inject
    @InjectPresenter
    lateinit var splashPresenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashPresenter.getForecastList()
    }

    override fun startMainScreen(currentWeather: CurrentWeather) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(CURRENT_WEATHER, currentWeather)
        startActivity(intent)
    }
}
