package com.innopolis.outside.screens.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.innopolis.outside.R
import com.innopolis.outside.common.BaseApp
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BaseApp.Companion.component?.inject(this)
        presenter.attachView(this)
        presenter.getForecastList()
    }

    override fun showMessage(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLocation(city: String, country: String) {

    }

    override fun showTemperature(temp: Int) {
        current_temperature_text.text = "$temp°"
    }

    override fun showHumidity(humidity: Int) {
        humidity_text.text = "$humidity%"
    }

    override fun showWind(wind: Int) {
        wind_text.text = "${wind}м/c"
    }
}
