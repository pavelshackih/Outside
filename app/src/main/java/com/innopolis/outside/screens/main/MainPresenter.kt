package com.innopolis.outside.screens.main

import com.innopolis.outside.screens.core.BasePresenter
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
class MainPresenter : BasePresenter<MainView> {

    var view: MainView? = null

    fun getForecastList() {
        view?.showProgress()
    }

    override fun attachView(view: MainView) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }
}