package com.innopolis.outside.screens.main

import com.innopolis.outside.common.network.Service
import com.innopolis.outside.screens.core.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
class MainPresenter : BasePresenter<MainView> {

    var view: MainView? = null
    var disposable: CompositeDisposable? = null
    var service: Service? = null

    @Inject constructor(service: Service) {
        this.service = service
    }

    override fun attachView(view: MainView) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }
}