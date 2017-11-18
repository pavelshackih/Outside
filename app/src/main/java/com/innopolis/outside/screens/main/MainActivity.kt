package com.innopolis.outside.screens.main

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.innopolis.outside.R
import com.innopolis.outside.common.CURRENT_WEATHER
import com.innopolis.outside.domain.converter.WindConverter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providePresenter() = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.showCurrentWeather(intent.getParcelableExtra(CURRENT_WEATHER))
    }

    override fun showLocation(city: String, country: String) {
        supportActionBar?.title = "$city, $country"
    }

    override fun showTemperature(temp: Int) {
        current_temperature_text.text = "$temp°"
    }

    override fun showHumidity(humidity: Int) {
        humidity_text.text = "$humidity%"
    }

    override fun showWind(windSpeed: Int, windDegree: Int) {
        wind_text.text = "$windSpeed ${getString(R.string.wind_speed)}, ${WindConverter.convertFromWindDegree(this, windDegree)}"
    }
}
