package com.innopolis.outside.screens.core

/**
 * @author Sergey Pinkevich
 */
interface BasePresenter<in V : BaseView> {
    fun attachView(view: V)
    fun detachView()
}