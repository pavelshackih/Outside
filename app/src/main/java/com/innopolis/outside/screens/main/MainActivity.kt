package com.innopolis.outside.screens.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.innopolis.outside.R
import com.innopolis.outside.common.BaseApp
import com.innopolis.outside.common.CURRENT_WEATHER
import com.innopolis.outside.domain.converter.WindConverter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providePresenter() = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.attachView(this)
        presenter.showCurrentWeather(intent.getParcelableExtra(CURRENT_WEATHER))
    }

    override fun showProgress() {
        general_layout.visibility = View.GONE
        progress_bar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        general_layout.visibility = View.VISIBLE
        progress_bar.visibility = View.GONE
    }

    override fun showLocation(location: String) {
        supportActionBar?.title = location
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
