package com.innopolis.outside.screens.main

import com.innopolis.outside.screens.core.BasePresenter
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
class MainPresenter : BasePresenter<MainView> {

    var view: MainView? = null

    override fun attachView(v: MainView) {
        view = v
    }

    override fun detachView() {
        view = null
    }
}