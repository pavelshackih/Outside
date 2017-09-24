package com.innopolis.outside.screens.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.Visibility
import android.view.View
import com.innopolis.outside.R
import com.innopolis.outside.common.BaseApp
import com.innopolis.outside.domain.model.ForecastDataMapper
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
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
        wind_text.text = "${convertFromWindDegree(windDegree)} $windSpeed ${getString(R.string.wind_speed)}"
    }

    /**
     * Convert the degree to the string equivalent
     * For example, 0° -> north, 52° -> northeast
     * @return id of the string resource
     */
    private fun convertFromWindDegree(degree: Int): String {
        val sideWorldsList = resources.getStringArray(R.array.worldsides)
        val changedDegree = degree + 22.5
        return sideWorldsList[(changedDegree % 8).toInt()]
    }
}
