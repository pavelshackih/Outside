package com.innopolis.outside.screens.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.innopolis.outside.screens.core.BasePresenter
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    var view: MainView? = null

    fun getForecastList() {
        view?.showProgress()
    }
}