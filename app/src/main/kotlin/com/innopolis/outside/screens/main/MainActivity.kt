package com.innopolis.outside.screens.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.innopolis.outside.R
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
