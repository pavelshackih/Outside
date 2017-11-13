package com.innopolis.outside.screens.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

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